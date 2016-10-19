package org.forYoink.interfaces.pdbml;

import javax.xml.bind.JAXBElement;
import java.math.BigInteger;

/**
 * Created by christian on 05/10/2016.
 */
public interface IAtomSite {

    JAXBElement getBEquivGeomMean();

    JAXBElement getBEquivGeomMeanEsd();


    JAXBElement getBIsoOrEquiv();


    JAXBElement getBIsoOrEquivEsd();


    JAXBElement getCartnX();


    JAXBElement getCartnXEsd();


    JAXBElement getCartnY();


    JAXBElement getCartnYEsd();


    JAXBElement getCartnZ();


    JAXBElement getCartnZEsd();


    JAXBElement getUEquivGeomMean();


    JAXBElement getUEquivGeomMeanEsd();


    JAXBElement getUIsoOrEquiv();


    JAXBElement getUIsoOrEquivEsd();


    JAXBElement getWyckoffSymbol();


    JAXBElement getAdpType();


    JAXBElement getAnisoB11();


    JAXBElement getAnisoB11Esd();


    JAXBElement getAnisoB12();


    JAXBElement getAnisoB12Esd();


    JAXBElement getAnisoB13();


    JAXBElement getAnisoB13Esd();


    JAXBElement getAnisoB22();


    JAXBElement getAnisoB22Esd();


    JAXBElement getAnisoB23();


    JAXBElement getAnisoB23Esd();


    JAXBElement getAnisoB33();


    JAXBElement getAnisoB33Esd();


    JAXBElement getAnisoU11();


    JAXBElement getAnisoU11Esd();


    JAXBElement getAnisoU12();


    JAXBElement getAnisoU12Esd();


    JAXBElement getAnisoU13();


    JAXBElement getAnisoU13Esd();


    JAXBElement getAnisoU22();


    JAXBElement getAnisoU22Esd();


    JAXBElement getAnisoU23();


    JAXBElement getAnisoU23Esd();


    JAXBElement getAnisoU33();


    JAXBElement getAnisoU33Esd();


    JAXBElement getAnisoRatio();


    JAXBElement getAttachedHydrogens();


    String getAuthAsymId();


    JAXBElement getAuthAtomId();


    JAXBElement getAuthCompId();


    JAXBElement getAuthSeqId();


    JAXBElement getCalcAttachedAtom();


    JAXBElement getCalcFlag();


    JAXBElement getChemicalConnNumber();


    JAXBElement getConstraints();


    JAXBElement getDetails();


    JAXBElement getDisorderAssembly();


    JAXBElement getDisorderGroup();


    JAXBElement getFootnoteId();


    JAXBElement getFractX();


    JAXBElement getFractXEsd();


    JAXBElement getFractY();


    JAXBElement getFractYEsd();


    JAXBElement getFractZ();


    JAXBElement getFractZEsd();


    JAXBElement getGroupPDB();


    String getLabelAltId();


    String getLabelAsymId();


    String getLabelAtomId();


    String getLabelCompId();


    String getLabelEntityId();


    BigInteger getLabelSeqId();


    JAXBElement getOccupancy();


    JAXBElement getOccupancyEsd();


    JAXBElement getPdbxPDBAtomName();


    JAXBElement getPdbxPDBInsCode();


    JAXBElement getPdbxPDBModelNum();


    JAXBElement getPdbxPDBResidueName();


    JAXBElement getPdbxPDBResidueNo();


    JAXBElement getPdbxPDBStrandId();


    JAXBElement getPdbxAuthAltId();


    JAXBElement getPdbxAuthAsymId();


    JAXBElement getPdbxAuthAtomName();


    JAXBElement getPdbxAuthCompId();


    JAXBElement getPdbxAuthSeqId();


    JAXBElement getPdbxFormalCharge();


    JAXBElement getPdbxNcsDomId();


    JAXBElement getPdbxStructGroupId();


    JAXBElement getPdbxTlsGroupId();


    JAXBElement getRefinementFlags();


    JAXBElement getRefinementFlagsAdp();


    JAXBElement getRefinementFlagsOccupancy();


    JAXBElement getRefinementFlagsPosn();


    JAXBElement getRestraints();


    JAXBElement getSymmetryMultiplicity();


    JAXBElement getThermalDisplaceType();


    String getTypeSymbol();


    String getId();


}
