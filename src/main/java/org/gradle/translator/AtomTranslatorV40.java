package org.gradle.translator;

import java.util.ArrayList;
import java.util.List;

import org.gradle.domain.Atom;
import org.gradle.pdbml.v40.generated.DatablockType;
import org.springframework.stereotype.Service;

@Service
public class AtomTranslatorV40 {

	public List<Atom> translateToAtom(DatablockType item) {
		List<Atom> atoms = new ArrayList<Atom>();
			System.out.println("number of Atoms: " + item.getAtomSiteCategory().getAtomSite().size());
			DatablockType dt = item;
			int nAtoms = dt.getAtomSiteCategory().getAtomSite().size();
			int i = 0;
			for (i=0; i < nAtoms; i++) {
				Double cx = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnX().getValue().getValue().doubleValue();
				Double cy = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnY().getValue().getValue().doubleValue();
				Double cz = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnZ().getValue().getValue().doubleValue();
				String element = dt.getAtomSiteCategory().getAtomSite().get(i).getTypeSymbol();
				String index = dt.getAtomSiteCategory().getAtomSite().get(i).getId();
				String chain = dt.getAtomSiteCategory().getAtomSite().get(i).getAuthAsymId();
				String compId = dt.getAtomSiteCategory().getAtomSite().get(i).getLabelCompId();
				String groupPDBx = dt.getAtomSiteCategory().getAtomSite().get(i).getGroupPDB().getValue().toString();
				//##################################################################################################################//
				Atom atom = new Atom();
				atom.setX(cx);
				atom.setY(cy);
				atom.setZ(cz);
				atom.setElement(element);
				atom.setIndex(index);
				atom.setChain(chain);
				atom.setLabelCompId(compId);
				atom.setGroupPDBx(groupPDBx);
				//##################################################################################################################//
				atoms.add(atom);
			}
		return atoms;
	}
}
