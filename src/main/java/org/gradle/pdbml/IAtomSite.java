package org.gradle.pdbml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by christian on 05/10/2016.
 */
public interface IAtomSite<T, K> {

    /**
     * Gets the value of the bEquivGeomMean property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<T> getBEquivGeomMean();

    /**
     * Sets the value of the bEquivGeomMean property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setBEquivGeomMean(JAXBElement<T> value);

    /**
     * Gets the value of the bEquivGeomMeanEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BEquivGeomMeanEsd }{@code >}
     */
    JAXBElement<BEquivGeomMeanEsd> getBEquivGeomMeanEsd();

    /**
     * Sets the value of the bEquivGeomMeanEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BEquivGeomMeanEsd }{@code >}
     */
    void setBEquivGeomMeanEsd(JAXBElement<BEquivGeomMeanEsd> value);

    /**
     * Gets the value of the bIsoOrEquiv property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BIsoOrEquiv }{@code >}
     */
    JAXBElement<BIsoOrEquiv> getBIsoOrEquiv();

    /**
     * Sets the value of the bIsoOrEquiv property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BIsoOrEquiv }{@code >}
     */
    void setBIsoOrEquiv(JAXBElement<BIsoOrEquiv> value);

    /**
     * Gets the value of the bIsoOrEquivEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BIsoOrEquivEsd }{@code >}
     */
    JAXBElement<BIsoOrEquivEsd> getBIsoOrEquivEsd();

    /**
     * Sets the value of the bIsoOrEquivEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BIsoOrEquivEsd }{@code >}
     */
    void setBIsoOrEquivEsd(JAXBElement<BIsoOrEquivEsd> value);

    /**
     * Gets the value of the cartnX property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CartnX }{@code >}
     */
    JAXBElement<CartnX> getCartnX();

    /**
     * Sets the value of the cartnX property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CartnX }{@code >}
     */
    void setCartnX(JAXBElement<CartnX> value);

    /**
     * Gets the value of the cartnXEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CartnXEsd }{@code >}
     */
    JAXBElement<CartnXEsd> getCartnXEsd();

    /**
     * Sets the value of the cartnXEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CartnXEsd }{@code >}
     */
    void setCartnXEsd(JAXBElement<CartnXEsd> value);

    /**
     * Gets the value of the cartnY property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CartnY }{@code >}
     */
    JAXBElement<CartnY> getCartnY();

    /**
     * Sets the value of the cartnY property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CartnY }{@code >}
     */
    void setCartnY(JAXBElement<CartnY> value);

    /**
     * Gets the value of the cartnYEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CartnYEsd }{@code >}
     */
    JAXBElement<CartnYEsd> getCartnYEsd();

    /**
     * Sets the value of the cartnYEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CartnYEsd }{@code >}
     */
    void setCartnYEsd(JAXBElement<CartnYEsd> value);

    /**
     * Gets the value of the cartnZ property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CartnZ }{@code >}
     */
    JAXBElement<CartnZ> getCartnZ();

    /**
     * Sets the value of the cartnZ property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CartnZ }{@code >}
     */
    void setCartnZ(JAXBElement<CartnZ> value);

    /**
     * Gets the value of the cartnZEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CartnZEsd }{@code >}
     */
    JAXBElement<CartnZEsd> getCartnZEsd();

    /**
     * Sets the value of the cartnZEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CartnZEsd }{@code >}
     */
    void setCartnZEsd(JAXBElement<CartnZEsd> value);

    /**
     * Gets the value of the uEquivGeomMean property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<T> getUEquivGeomMean();

    /**
     * Sets the value of the uEquivGeomMean property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setUEquivGeomMean(JAXBElement<T> value);

    /**
     * Gets the value of the uEquivGeomMeanEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link UEquivGeomMeanEsd }{@code >}
     */
    JAXBElement<UEquivGeomMeanEsd> getUEquivGeomMeanEsd();

    /**
     * Sets the value of the uEquivGeomMeanEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link UEquivGeomMeanEsd }{@code >}
     */
    void setUEquivGeomMeanEsd(JAXBElement<UEquivGeomMeanEsd> value);

    /**
     * Gets the value of the uIsoOrEquiv property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<T> getUIsoOrEquiv();

    /**
     * Sets the value of the uIsoOrEquiv property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setUIsoOrEquiv(JAXBElement<T> value);

    /**
     * Gets the value of the uIsoOrEquivEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link UIsoOrEquivEsd }{@code >}
     */
    JAXBElement<UIsoOrEquivEsd> getUIsoOrEquivEsd();

    /**
     * Sets the value of the uIsoOrEquivEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link UIsoOrEquivEsd }{@code >}
     */
    void setUIsoOrEquivEsd(JAXBElement<UIsoOrEquivEsd> value);

    /**
     * Gets the value of the wyckoffSymbol property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getWyckoffSymbol();

    /**
     * Sets the value of the wyckoffSymbol property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setWyckoffSymbol(JAXBElement<String> value);

    /**
     * Gets the value of the adpType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getAdpType();

    /**
     * Sets the value of the adpType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setAdpType(JAXBElement<String> value);

    /**
     * Gets the value of the anisoB11 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB11 }{@code >}
     */
    JAXBElement<AnisoB11> getAnisoB11();

    /**
     * Sets the value of the anisoB11 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB11 }{@code >}
     */
    void setAnisoB11(JAXBElement<AnisoB11> value);

    /**
     * Gets the value of the anisoB11Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB11Esd }{@code >}
     */
    JAXBElement<AnisoB11Esd> getAnisoB11Esd();

    /**
     * Sets the value of the anisoB11Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB11Esd }{@code >}
     */
    void setAnisoB11Esd(JAXBElement<AnisoB11Esd> value);

    /**
     * Gets the value of the anisoB12 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB12 }{@code >}
     */
    JAXBElement<AnisoB12> getAnisoB12();

    /**
     * Sets the value of the anisoB12 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB12 }{@code >}
     */
    void setAnisoB12(JAXBElement<AnisoB12> value);

    /**
     * Gets the value of the anisoB12Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB12Esd }{@code >}
     */
    JAXBElement<AnisoB12Esd> getAnisoB12Esd();

    /**
     * Sets the value of the anisoB12Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB12Esd }{@code >}
     */
    void setAnisoB12Esd(JAXBElement<AnisoB12Esd> value);

    /**
     * Gets the value of the anisoB13 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB13 }{@code >}
     */
    JAXBElement<AnisoB13> getAnisoB13();

    /**
     * Sets the value of the anisoB13 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB13 }{@code >}
     */
    void setAnisoB13(JAXBElement<AnisoB13> value);

    /**
     * Gets the value of the anisoB13Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB13Esd }{@code >}
     */
    JAXBElement<AnisoB13Esd> getAnisoB13Esd();

    /**
     * Sets the value of the anisoB13Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB13Esd }{@code >}
     */
    void setAnisoB13Esd(JAXBElement<AnisoB13Esd> value);

    /**
     * Gets the value of the anisoB22 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB22 }{@code >}
     */
    JAXBElement<AnisoB22> getAnisoB22();

    /**
     * Sets the value of the anisoB22 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB22 }{@code >}
     */
    void setAnisoB22(JAXBElement<AnisoB22> value);

    /**
     * Gets the value of the anisoB22Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB22Esd }{@code >}
     */
    JAXBElement<AnisoB22Esd> getAnisoB22Esd();

    /**
     * Sets the value of the anisoB22Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB22Esd }{@code >}
     */
    void setAnisoB22Esd(JAXBElement<AnisoB22Esd> value);

    /**
     * Gets the value of the anisoB23 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB23 }{@code >}
     */
    JAXBElement<AnisoB23> getAnisoB23();

    /**
     * Sets the value of the anisoB23 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB23 }{@code >}
     */
    void setAnisoB23(JAXBElement<AnisoB23> value);

    /**
     * Gets the value of the anisoB23Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB23Esd }{@code >}
     */
    JAXBElement<AnisoB23Esd> getAnisoB23Esd();

    /**
     * Sets the value of the anisoB23Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB23Esd }{@code >}
     */
    void setAnisoB23Esd(JAXBElement<AnisoB23Esd> value);

    /**
     * Gets the value of the anisoB33 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB33 }{@code >}
     */
    JAXBElement<AnisoB33> getAnisoB33();

    /**
     * Sets the value of the anisoB33 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB33 }{@code >}
     */
    void setAnisoB33(JAXBElement<AnisoB33> value);

    /**
     * Gets the value of the anisoB33Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoB33Esd }{@code >}
     */
    JAXBElement<AnisoB33Esd> getAnisoB33Esd();

    /**
     * Sets the value of the anisoB33Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoB33Esd }{@code >}
     */
    void setAnisoB33Esd(JAXBElement<AnisoB33Esd> value);

    /**
     * Gets the value of the anisoU11 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU11 }{@code >}
     */
    JAXBElement<AnisoU11> getAnisoU11();

    /**
     * Sets the value of the anisoU11 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU11 }{@code >}
     */
    void setAnisoU11(JAXBElement<AnisoU11> value);

    /**
     * Gets the value of the anisoU11Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU11Esd }{@code >}
     */
    JAXBElement<AnisoU11Esd> getAnisoU11Esd();

    /**
     * Sets the value of the anisoU11Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU11Esd }{@code >}
     */
    void setAnisoU11Esd(JAXBElement<AnisoU11Esd> value);

    /**
     * Gets the value of the anisoU12 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU12 }{@code >}
     */
    JAXBElement<AnisoU12> getAnisoU12();

    /**
     * Sets the value of the anisoU12 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU12 }{@code >}
     */
    void setAnisoU12(JAXBElement<AnisoU12> value);

    /**
     * Gets the value of the anisoU12Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU12Esd }{@code >}
     */
    JAXBElement<AnisoU12Esd> getAnisoU12Esd();

    /**
     * Sets the value of the anisoU12Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU12Esd }{@code >}
     */
    void setAnisoU12Esd(JAXBElement<AnisoU12Esd> value);

    /**
     * Gets the value of the anisoU13 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU13 }{@code >}
     */
    JAXBElement<AnisoU13> getAnisoU13();

    /**
     * Sets the value of the anisoU13 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU13 }{@code >}
     */
    void setAnisoU13(JAXBElement<AnisoU13> value);

    /**
     * Gets the value of the anisoU13Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU13Esd }{@code >}
     */
    JAXBElement<AnisoU13Esd> getAnisoU13Esd();

    /**
     * Sets the value of the anisoU13Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU13Esd }{@code >}
     */
    void setAnisoU13Esd(JAXBElement<AnisoU13Esd> value);

    /**
     * Gets the value of the anisoU22 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU22 }{@code >}
     */
    JAXBElement<AnisoU22> getAnisoU22();

    /**
     * Sets the value of the anisoU22 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU22 }{@code >}
     */
    void setAnisoU22(JAXBElement<AnisoU22> value);

    /**
     * Gets the value of the anisoU22Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU22Esd }{@code >}
     */
    JAXBElement<AnisoU22Esd> getAnisoU22Esd();

    /**
     * Sets the value of the anisoU22Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU22Esd }{@code >}
     */
    void setAnisoU22Esd(JAXBElement<AnisoU22Esd> value);

    /**
     * Gets the value of the anisoU23 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU23 }{@code >}
     */
    JAXBElement<AnisoU23> getAnisoU23();

    /**
     * Sets the value of the anisoU23 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU23 }{@code >}
     */
    void setAnisoU23(JAXBElement<AnisoU23> value);

    /**
     * Gets the value of the anisoU23Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU23Esd }{@code >}
     */
    JAXBElement<AnisoU23Esd> getAnisoU23Esd();

    /**
     * Sets the value of the anisoU23Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU23Esd }{@code >}
     */
    void setAnisoU23Esd(JAXBElement<AnisoU23Esd> value);

    /**
     * Gets the value of the anisoU33 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU33 }{@code >}
     */
    JAXBElement<AnisoU33> getAnisoU33();

    /**
     * Sets the value of the anisoU33 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU33 }{@code >}
     */
    void setAnisoU33(JAXBElement<AnisoU33> value);

    /**
     * Gets the value of the anisoU33Esd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AnisoU33Esd }{@code >}
     */
    JAXBElement<AnisoU33Esd> getAnisoU33Esd();

    /**
     * Sets the value of the anisoU33Esd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AnisoU33Esd }{@code >}
     */
    void setAnisoU33Esd(JAXBElement<AnisoU33Esd> value);

    /**
     * Gets the value of the anisoRatio property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<T> getAnisoRatio();

    /**
     * Sets the value of the anisoRatio property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setAnisoRatio(JAXBElement<T> value);

    /**
     * Gets the value of the attachedHydrogens property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    JAXBElement<K> getAttachedHydrogens();

    /**
     * Sets the value of the attachedHydrogens property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    void setAttachedHydrogens(JAXBElement<K> value);

    /**
     * Gets the value of the authAsymId property.
     *
     * @return possible object is
     * {@link String }
     */
    String getAuthAsymId();

    /**
     * Sets the value of the authAsymId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setAuthAsymId(String value);

    /**
     * Gets the value of the authAtomId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getAuthAtomId();

    /**
     * Sets the value of the authAtomId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setAuthAtomId(JAXBElement<String> value);

    /**
     * Gets the value of the authCompId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getAuthCompId();

    /**
     * Sets the value of the authCompId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setAuthCompId(JAXBElement<String> value);

    /**
     * Gets the value of the authSeqId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getAuthSeqId();

    /**
     * Sets the value of the authSeqId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setAuthSeqId(JAXBElement<String> value);

    /**
     * Gets the value of the calcAttachedAtom property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getCalcAttachedAtom();

    /**
     * Sets the value of the calcAttachedAtom property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setCalcAttachedAtom(JAXBElement<String> value);

    /**
     * Gets the value of the calcFlag property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getCalcFlag();

    /**
     * Sets the value of the calcFlag property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setCalcFlag(JAXBElement<String> value);

    /**
     * Gets the value of the chemicalConnNumber property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    JAXBElement<BigInteger> getChemicalConnNumber();

    /**
     * Sets the value of the chemicalConnNumber property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    void setChemicalConnNumber(JAXBElement<BigInteger> value);

    /**
     * Gets the value of the constraints property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getConstraints();

    /**
     * Sets the value of the constraints property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setConstraints(JAXBElement<String> value);

    /**
     * Gets the value of the details property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getDetails();

    /**
     * Sets the value of the details property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setDetails(JAXBElement<String> value);

    /**
     * Gets the value of the disorderAssembly property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getDisorderAssembly();

    /**
     * Sets the value of the disorderAssembly property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setDisorderAssembly(JAXBElement<String> value);

    /**
     * Gets the value of the disorderGroup property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getDisorderGroup();

    /**
     * Sets the value of the disorderGroup property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setDisorderGroup(JAXBElement<String> value);

    /**
     * Gets the value of the footnoteId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getFootnoteId();

    /**
     * Sets the value of the footnoteId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setFootnoteId(JAXBElement<String> value);

    /**
     * Gets the value of the fractX property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<BigDecimal> getFractX();

    /**
     * Sets the value of the fractX property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setFractX(JAXBElement<BigDecimal> value);

    /**
     * Gets the value of the fractXEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<BigDecimal> getFractXEsd();

    /**
     * Sets the value of the fractXEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setFractXEsd(JAXBElement<BigDecimal> value);

    /**
     * Gets the value of the fractY property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<BigDecimal> getFractY();

    /**
     * Sets the value of the fractY property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setFractY(JAXBElement<BigDecimal> value);

    /**
     * Gets the value of the fractYEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<BigDecimal> getFractYEsd();

    /**
     * Sets the value of the fractYEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setFractYEsd(JAXBElement<BigDecimal> value);

    /**
     * Gets the value of the fractZ property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<BigDecimal> getFractZ();

    /**
     * Sets the value of the fractZ property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setFractZ(JAXBElement<BigDecimal> value);

    /**
     * Gets the value of the fractZEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<BigDecimal> getFractZEsd();

    /**
     * Sets the value of the fractZEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setFractZEsd(JAXBElement<BigDecimal> value);

    /**
     * Gets the value of the groupPDB property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getGroupPDB();

    /**
     * Sets the value of the groupPDB property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setGroupPDB(JAXBElement<String> value);

    /**
     * Gets the value of the labelAltId property.
     *
     * @return possible object is
     * {@link String }
     */
    String getLabelAltId();

    /**
     * Sets the value of the labelAltId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setLabelAltId(String value);

    /**
     * Gets the value of the labelAsymId property.
     *
     * @return possible object is
     * {@link String }
     */
    String getLabelAsymId();

    /**
     * Sets the value of the labelAsymId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setLabelAsymId(String value);

    /**
     * Gets the value of the labelAtomId property.
     *
     * @return possible object is
     * {@link String }
     */
    String getLabelAtomId();

    /**
     * Sets the value of the labelAtomId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setLabelAtomId(String value);

    /**
     * Gets the value of the labelCompId property.
     *
     * @return possible object is
     * {@link String }
     */
    String getLabelCompId();

    /**
     * Sets the value of the labelCompId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setLabelCompId(String value);

    /**
     * Gets the value of the labelEntityId property.
     *
     * @return possible object is
     * {@link String }
     */
    String getLabelEntityId();

    /**
     * Sets the value of the labelEntityId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setLabelEntityId(String value);

    /**
     * Gets the value of the labelSeqId property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    BigInteger getLabelSeqId();

    /**
     * Sets the value of the labelSeqId property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    void setLabelSeqId(BigInteger value);

    /**
     * Gets the value of the occupancy property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<BigDecimal> getOccupancy();

    /**
     * Sets the value of the occupancy property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setOccupancy(JAXBElement<BigDecimal> value);

    /**
     * Gets the value of the occupancyEsd property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    JAXBElement<BigDecimal> getOccupancyEsd();

    /**
     * Sets the value of the occupancyEsd property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    void setOccupancyEsd(JAXBElement<BigDecimal> value);

    /**
     * Gets the value of the pdbxPDBAtomName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxPDBAtomName();

    /**
     * Sets the value of the pdbxPDBAtomName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxPDBAtomName(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxPDBInsCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxPDBInsCode();

    /**
     * Sets the value of the pdbxPDBInsCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxPDBInsCode(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxPDBModelNum property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    JAXBElement<BigInteger> getPdbxPDBModelNum();

    /**
     * Sets the value of the pdbxPDBModelNum property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    void setPdbxPDBModelNum(JAXBElement<BigInteger> value);

    /**
     * Gets the value of the pdbxPDBResidueName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxPDBResidueName();

    /**
     * Sets the value of the pdbxPDBResidueName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxPDBResidueName(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxPDBResidueNo property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxPDBResidueNo();

    /**
     * Sets the value of the pdbxPDBResidueNo property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxPDBResidueNo(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxPDBStrandId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxPDBStrandId();

    /**
     * Sets the value of the pdbxPDBStrandId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxPDBStrandId(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxAuthAltId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxAuthAltId();

    /**
     * Sets the value of the pdbxAuthAltId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxAuthAltId(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxAuthAsymId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxAuthAsymId();

    /**
     * Sets the value of the pdbxAuthAsymId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxAuthAsymId(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxAuthAtomName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxAuthAtomName();

    /**
     * Sets the value of the pdbxAuthAtomName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxAuthAtomName(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxAuthCompId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxAuthCompId();

    /**
     * Sets the value of the pdbxAuthCompId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxAuthCompId(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxAuthSeqId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxAuthSeqId();

    /**
     * Sets the value of the pdbxAuthSeqId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxAuthSeqId(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxFormalCharge property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    JAXBElement<K> getPdbxFormalCharge();

    /**
     * Sets the value of the pdbxFormalCharge property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    void setPdbxFormalCharge(JAXBElement<K> value);

    /**
     * Gets the value of the pdbxNcsDomId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxNcsDomId();

    /**
     * Sets the value of the pdbxNcsDomId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxNcsDomId(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxStructGroupId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxStructGroupId();

    /**
     * Sets the value of the pdbxStructGroupId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxStructGroupId(JAXBElement<String> value);

    /**
     * Gets the value of the pdbxTlsGroupId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getPdbxTlsGroupId();

    /**
     * Sets the value of the pdbxTlsGroupId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setPdbxTlsGroupId(JAXBElement<String> value);

    /**
     * Gets the value of the refinementFlags property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getRefinementFlags();

    /**
     * Sets the value of the refinementFlags property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setRefinementFlags(JAXBElement<String> value);

    /**
     * Gets the value of the refinementFlagsAdp property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getRefinementFlagsAdp();

    /**
     * Sets the value of the refinementFlagsAdp property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setRefinementFlagsAdp(JAXBElement<String> value);

    /**
     * Gets the value of the refinementFlagsOccupancy property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getRefinementFlagsOccupancy();

    /**
     * Sets the value of the refinementFlagsOccupancy property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setRefinementFlagsOccupancy(JAXBElement<String> value);

    /**
     * Gets the value of the refinementFlagsPosn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getRefinementFlagsPosn();

    /**
     * Sets the value of the refinementFlagsPosn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setRefinementFlagsPosn(JAXBElement<String> value);

    /**
     * Gets the value of the restraints property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getRestraints();

    /**
     * Sets the value of the restraints property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setRestraints(JAXBElement<String> value);

    /**
     * Gets the value of the symmetryMultiplicity property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    JAXBElement<K> getSymmetryMultiplicity();

    /**
     * Sets the value of the symmetryMultiplicity property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    void setSymmetryMultiplicity(JAXBElement<K> value);

    /**
     * Gets the value of the thermalDisplaceType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    JAXBElement<String> getThermalDisplaceType();

    /**
     * Sets the value of the thermalDisplaceType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    void setThermalDisplaceType(JAXBElement<String> value);

    /**
     * Gets the value of the typeSymbol property.
     *
     * @return possible object is
     * {@link String }
     */
    String getTypeSymbol();

    /**
     * Sets the value of the typeSymbol property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setTypeSymbol(String value);

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    String getId();

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setId(String value);

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB11 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB11Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB12 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB12Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB13 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB13Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB22 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB22Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB23 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB23Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB33 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoB33Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU11 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU11Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU12 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU12Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU13 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU13Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU22 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU22Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU23 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU23Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU33 {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class AnisoU33Esd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class BEquivGeomMeanEsd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class BIsoOrEquiv {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="8pi2_angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class BIsoOrEquivEsd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "8pi2_angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class CartnX {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class CartnXEsd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class CartnY {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class CartnYEsd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class CartnZ {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class CartnZEsd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class UEquivGeomMeanEsd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    class UIsoOrEquivEsd {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnits() {
            if (units == null) {
                return "angstroms_squared";
            } else {
                return units;
            }
        }

        /**
         * Sets the value of the units property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }
}
