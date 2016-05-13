package org.gradle.translator;

import java.util.ArrayList;
import java.util.List;

import org.gradle.domain.Atom;
import org.gradle.domain.Molecule;
import org.gradle.pdbml.v42.generated.DatablockType;
import org.springframework.stereotype.Service;

@Service
public class MoleculeTranslatorV42 {

	Integer solventCounter = 0;
	Integer singleAtomCounter = 0;

	public List<Molecule> translateToMolecule(DatablockType item){
		AtomTranslatorV42 at = new AtomTranslatorV42();
		List<Atom> atoms = at.translateToAtom(item);
		List<Molecule> molecules = new ArrayList<Molecule>();
		//start for-loop
		for(int i = 0; i<atoms.size();i++){
			/*
			 * Check GroupPDBx
			 */
			//############################################################################################################
			if (atoms.get(i).getGroupPDBx().matches("ATOM")==true){
				/*
				 * Check Chain
				 */
				//*********************************************************************************************************
				if (atoms.get(i).getChain()==atoms.get(0).getChain()){
					Molecule molecule =  new Molecule();
					molecule.setFileName(item.getDatablockName() + ": ATOM, Chain: " + atoms.get(i).getChain());
					int j = i;
					while(atoms.get(j).getChain()==atoms.get(i).getChain()){
						molecule.atoms.add(atoms.get(j));
						molecule.atomCount++;
						j++;
						if(atoms.get(j)==null){
							break;
						}
					}
					i = j-1;
					molecules.add(molecule);
					System.out.println("Number of Proteinatoms in Chain "+ atoms.get(i).getChain() +" :" + molecule.atomCount);
				}else{
					Molecule molecule = new Molecule();
					molecule.setFileName(item.getDatablockName() + ": ATOM, Chain: " + atoms.get(i).getChain());
					int j = i;
					while(atoms.get(j).getChain()==atoms.get(i).getChain()){
						molecule.atoms.add(atoms.get(j));
						molecule.atomCount++;
						j++;
						if(atoms.get(j)==null){
							break;
						}
					}
					i = j-1;
					molecules.add(molecule);
					System.out.println("Number of Proteinatoms in Chain "+ atoms.get(i).getChain() +" :" + molecule.atomCount);
				}
				//*********************************************************************************************************
				 
			}else{
				/*
				 * Check LabelCompId
				 */
			    //----------------------------------------------------------------------------------------------------------
				if(atoms.get(i).getLabelCompId().matches("HOH")==true){
					Molecule solvent = new Molecule();
					solvent.atoms.add(atoms.get(i));
					solvent.setFileName(item.getDatablockName() + ": " + atoms.get(i).getLabelCompId());
					molecules.add(solvent);
					solventCounter++;
				}else if(atoms.get(i).getLabelCompId()==atoms.get(i).getElement()){
					Molecule singleAtom = new Molecule();
					singleAtom.setFileName(item.getDatablockName() + ": " + atoms.get(i).getLabelCompId());
					singleAtom.atoms.add(atoms.get(i));
					molecules.add(singleAtom);
					System.out.println(atoms.get(i));
					singleAtomCounter++;
				} 
				else{
					Molecule mole = new Molecule();
					mole.setFileName(item.getDatablockName()+ " " + atoms.get(i).getLabelCompId());
					int j = i;
						while(atoms.get(j).getLabelCompId()==atoms.get(i).getLabelCompId()){
							mole.atoms.add(atoms.get(j));
							mole.atomCount++;
							j++;
							if(atoms.get(j)==null){
								break;
						    }
					}
					i = j-1;
					molecules.add(mole);
					System.out.println("Number of Atoms in " + mole.getFileName() + "-Molecule:" + mole.atomCount);
				}
				//----------------------------------------------------------------------------------------------------------
			}
			//############################################################################################################
			
		}
		//end of for-loop
		System.out.println("Number of single Atoms: " + singleAtomCounter);
		System.out.println("Number of Solventmolecules: " + solventCounter);
		return molecules;
	}
}
