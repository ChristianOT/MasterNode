package org.gradle.config;

import java.sql.Blob;
import java.sql.Clob;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.gradle.dataBaseRepositories.AtomRepository;
import org.gradle.dataBaseRepositories.DatablockTypeRepository;
import org.gradle.dataBaseRepositories.SmsRepository;
import org.gradle.domain.MyAtom;
import org.gradle.domain.SimpleAtom;
import org.gradle.domain.SimpleCoordFactory;
import org.gradle.domain.SimpleMolecularSystem;
import org.gradle.domain.DatablockType;
import org.gradle.domain.SimpleMolecule;
import org.gradle.domain.SimpleVector3DFactory;
import org.gradle.interfaces.Atom;
import org.gradle.interfaces.Coord;
import org.gradle.interfaces.Element;
import org.gradle.interfaces.Molecule;
import org.gradle.interfaces.Vector;
import org.hibernate.type.ClobType;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service
@ComponentScan("org.gradle.interfaces")
public class TestItemWriter implements ItemWriter<DatablockType> {

	@Autowired
	SimpleVector3DFactory sv3f;

	@Autowired
	SimpleCoordFactory scf;

	@Autowired
	DatablockTypeRepository dtr;

	@Autowired
	AtomRepository ar;

	@Autowired
	SmsRepository sr;
	
	@Override
	public void write(List<? extends DatablockType> items) throws Exception {
		System.out.println("********************************** here");

		System.out.println(moleculeSystemTranslator(items).getMolecules().get(0).getAtoms());
		sr.save(moleculeSystemTranslator(items));
		//atomTranslator(items);
		// dtr.save(items);
		// System.out.println(ar.findAll().get(0).getxCoord());

	}

	private List<Atom> atomTranslator(List<? extends DatablockType> items) {
		System.out.println("number of Atoms: " + items.get(0).getAtomSiteCategory().getAtomSite().size());
		DatablockType dt = items.get(0);
		int nAtoms = 2; //dt.getAtomSiteCategory().getAtomSite().size();
		int i = 0;
		List<Atom> atoms = new ArrayList<Atom>();
		for (i=0; i < nAtoms; i++) {
			Double cx = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnX().getValue().getValue().doubleValue();
			Double cy = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnY().getValue().getValue().doubleValue();
			Double cz = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnZ().getValue().getValue().doubleValue();
			//System.out.println(cx + " " + cy + " " + cz);
			Integer index = Integer.parseInt(dt.getAtomSiteCategory().getAtomSite().get(i).getId());
			Element element = Element.valueOf(dt.getAtomTypeCategory().getAtomType().get(i).getSymbol());
			Coord coords = scf.create();
			coords.setCoords(sv3f.create(cx, cy, cz));
			SimpleAtom sa = new SimpleAtom(index, element, coords);
			//System.out.println(sa);
			// ar.save(sa);
			atoms.add(sa);
		}
		return atoms;
	}

	public List<Molecule> moleculeTranslator(List<? extends DatablockType> items) {
		int index=0;
		List<Atom> atoms = atomTranslator(items);
		SimpleMolecule sm = new SimpleMolecule(index, atoms);
		List<Molecule> molecules = new ArrayList<Molecule>();
		molecules.add(sm);
		return molecules;

	}

	public SimpleMolecularSystem moleculeSystemTranslator(List<? extends DatablockType> items){
		List<Molecule> molecules = moleculeTranslator(items);
		SimpleMolecularSystem sms = new SimpleMolecularSystem(molecules);
		return sms;
	}
}
