package org.gradle.domain;

import org.gradle.interfaces.domain.Atom;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.model.molecular.RadialGrid;

@NodeEntity
public class SimpleAtom implements Atom {

    @GraphId
    private Long id;

    protected int index;
    protected Element elementType;
    private Coord coordinate;
    private RadialGrid radial_grid;

    public SimpleAtom() { }

    public SimpleAtom(int index, Element elementType, Coord coordinate) {
        this.index = index;
        this.elementType = elementType;
        this.coordinate = coordinate;
    }

    public Element getElementType() {
        return this.elementType;
    }

    public int getIndex() {
        return this.index;
    }

    public Coord getCoordinate() {
        return this.coordinate;
    }

    public double getX3() {
        return this.coordinate.getCoords().getX();
    }

    public double getY3() {
        return this.coordinate.getCoords().getY();
    }

    public double getZ3() {
        return this.coordinate.getCoords().getZ();
    }

    public RadialGrid getRadialGrid() {
        return this.radial_grid;
    }

    public void setRadialGrid(RadialGrid radial_grid) {
        this.radial_grid = radial_grid;
    }

    @Override
    public String toString() {
        return "SimpleAtom{" +
                "index=" + index +
                ", elementType=" + elementType +
                ", coordinate=" + coordinate.getCoords().getX()
                + " " + coordinate.getCoords().getY()
                + " " + coordinate.getCoords().getZ()
                + '}';
    }
}