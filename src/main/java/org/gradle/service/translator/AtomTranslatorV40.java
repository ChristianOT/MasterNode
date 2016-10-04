package org.gradle.service.translator;

import java.util.ArrayList;
import java.util.List;

import org.gradle.domain.Atom;
import org.gradle.pdbml.IAtomSiteType;
import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v40.generated.AtomSiteType;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;


@Service
public class AtomTranslatorV40 {

	public List<Atom> translateToAtom(JAXBElement<IDatablockType> item) {
		List<Atom> atoms = new ArrayList<Atom>();
		System.out.println("number of Atoms: " + item.getValue().getAtomSiteCategory().getAtomSite().size());
		List<AtomSiteType.AtomSite> dt = item.getValue().getAtomSiteCategory().getAtomSite();
		int nAtoms = dt.size();
		int i = 0;
		for (i=0; i < nAtoms; i++) {

			Double cx = dt.get(i).getCartnX().getValue().getValue().doubleValue();
			Double cy = dt.get(i).getCartnY().getValue().getValue().doubleValue();
			Double cz = dt.get(i).getCartnZ().getValue().getValue().doubleValue();
			double[] coords = {cx,cy,cz};
				
			String element = dt.get(i).getTypeSymbol();
			String index = dt.get(i).getId();
			String chain = dt.get(i).getAuthAsymId();
			String compId = dt.get(i).getLabelCompId();
			String groupPDBx = dt.get(i).getGroupPDB().getValue().toString();
				
			Atom atom = new Atom();

			atom.setX(cx);
			atom.setY(cy);
			atom.setZ(cz);
			atom.setElement(element);
			atom.setIndex(index);
			atom.setChain(chain);
			atom.setLabelCompId(compId);
			atom.setGroupPDBx(groupPDBx);
			atoms.add(atom);
		}
		return atoms;
	}
}
