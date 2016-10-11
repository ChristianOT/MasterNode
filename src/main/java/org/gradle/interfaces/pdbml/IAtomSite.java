package org.gradle.interfaces.pdbml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by christian on 05/10/2016.
 */
public interface IAtomSite {

    public JAXBElement getBEquivGeomMean();

    public JAXBElement getBEquivGeomMeanEsd();


    public JAXBElement getBIsoOrEquiv();


    public JAXBElement getBIsoOrEquivEsd();


    public JAXBElement getCartnX();


    public JAXBElement getCartnXEsd();


    public JAXBElement getCartnY();


    public JAXBElement getCartnYEsd();


    public JAXBElement getCartnZ();


    public JAXBElement getCartnZEsd();


    public JAXBElement getUEquivGeomMean();


    public JAXBElement getUEquivGeomMeanEsd();


    public JAXBElement getUIsoOrEquiv();


    public JAXBElement getUIsoOrEquivEsd();


    public JAXBElement getWyckoffSymbol();


    public JAXBElement getAdpType();


    public JAXBElement getAnisoB11();


    public JAXBElement getAnisoB11Esd();


    public JAXBElement getAnisoB12();


    public JAXBElement getAnisoB12Esd();


    public JAXBElement getAnisoB13();


    public JAXBElement getAnisoB13Esd();


    public JAXBElement getAnisoB22();


    public JAXBElement getAnisoB22Esd();


    public JAXBElement getAnisoB23();


    public JAXBElement getAnisoB23Esd();


    public JAXBElement getAnisoB33();


    public JAXBElement getAnisoB33Esd();


    public JAXBElement getAnisoU11();


    public JAXBElement getAnisoU11Esd();


    public JAXBElement getAnisoU12();


    public JAXBElement getAnisoU12Esd();


    public JAXBElement getAnisoU13();


    public JAXBElement getAnisoU13Esd();


    public JAXBElement getAnisoU22();


    public JAXBElement getAnisoU22Esd();


    public JAXBElement getAnisoU23();


    public JAXBElement getAnisoU23Esd();


    public JAXBElement getAnisoU33();


    public JAXBElement getAnisoU33Esd();


    public JAXBElement getAnisoRatio();


    public JAXBElement getAttachedHydrogens();


    public String getAuthAsymId();


    public JAXBElement getAuthAtomId();


    public JAXBElement getAuthCompId();


    public JAXBElement getAuthSeqId();


    public JAXBElement getCalcAttachedAtom();


    public JAXBElement getCalcFlag();


    public JAXBElement getChemicalConnNumber();


    public JAXBElement getConstraints();


    public JAXBElement getDetails();


    public JAXBElement getDisorderAssembly();


    public JAXBElement getDisorderGroup();


    public JAXBElement getFootnoteId();


    public JAXBElement getFractX();


    public JAXBElement getFractXEsd();


    public JAXBElement getFractY();


    public JAXBElement getFractYEsd();


    public JAXBElement getFractZ();


    public JAXBElement getFractZEsd();


    public JAXBElement getGroupPDB();


    public String getLabelAltId();


    public String getLabelAsymId();


    public String getLabelAtomId();


    public String getLabelCompId();


    public String getLabelEntityId();


    public BigInteger getLabelSeqId();


    public JAXBElement getOccupancy();


    public JAXBElement getOccupancyEsd();


    public JAXBElement getPdbxPDBAtomName();


    public JAXBElement getPdbxPDBInsCode();


    public JAXBElement getPdbxPDBModelNum();


    public JAXBElement getPdbxPDBResidueName();


    public JAXBElement getPdbxPDBResidueNo();


    public JAXBElement getPdbxPDBStrandId();


    public JAXBElement getPdbxAuthAltId();


    public JAXBElement getPdbxAuthAsymId();


    public JAXBElement getPdbxAuthAtomName();


    public JAXBElement getPdbxAuthCompId();


    public JAXBElement getPdbxAuthSeqId();


    public JAXBElement getPdbxFormalCharge();


    public JAXBElement getPdbxNcsDomId();


    public JAXBElement getPdbxStructGroupId();


    public JAXBElement getPdbxTlsGroupId();


    public JAXBElement getRefinementFlags();


    public JAXBElement getRefinementFlagsAdp();


    public JAXBElement getRefinementFlagsOccupancy();


    public JAXBElement getRefinementFlagsPosn();


    public JAXBElement getRestraints();


    public JAXBElement getSymmetryMultiplicity();


    public JAXBElement getThermalDisplaceType();


    public String getTypeSymbol();


    public String getId();


}
