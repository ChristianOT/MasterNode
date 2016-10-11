package org.gradle.interfaces.domain;

import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.model.molecular.RadialGrid;

public interface Atom {
    Element getElementType();

    int getIndex();

    RadialGrid getRadialGrid();

    void setRadialGrid(RadialGrid var1);

    Coord getCoordinate();

    double getX3();

    double getY3();

    double getZ3();
}