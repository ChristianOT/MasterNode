package org.gradle.yoinkTranslator;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.gradle.pdbml.v40.generated.DatablockType;
import org.gradle.pdbml.v40.generated.AtomSiteType.AtomSite;
import org.wallerlab.yoink.api.model.molecular.Atom;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory;
import org.wallerlab.yoink.molecular.domain.SimpleAtom;
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory;
import org.gradle.interfaces.DatablockTypeInterface;
import org.gradle.interfaces.Translator;

public class AtomTranslator implements Translator<Atom,DatablockTypeInterface>{

	@Resource
	private SimpleVector3DFactory myVector3D;

	@Resource
	private SimpleCoordFactory coordFactory;

	@Override
	public List<Atom> translate(DatablockTypeInterface item) {
		List<Atom> atoms = new ArrayList<Atom>();
		System.out.println("number of Atoms: " + item.getAtomSiteCategory().getAtomSite().size());
		List<AtomSite> dt = item.getAtomSiteCategory().getAtomSite();
		int nAtoms = item.getAtomSiteCategory().getAtomSite().size();
		int i = 0;
		for (i = 0; i < nAtoms; i++) {

			Double cx = dt.get(i).getCartnX().getValue().getValue().doubleValue();
			Double cy = dt.get(i).getCartnY().getValue().getValue().doubleValue();
			Double cz = dt.get(i).getCartnZ().getValue().getValue().doubleValue();
			double[] coords = { cx, cy, cz };

			String element = dt.get(i).getTypeSymbol();
			String index = dt.get(i).getId();

			Atom atom = new SimpleAtom(Integer.parseInt(index)
					, Element.valueOf(element), coordFactory.create(coords));

			atoms.add(atom);
		}
		return atoms;
	}

}
