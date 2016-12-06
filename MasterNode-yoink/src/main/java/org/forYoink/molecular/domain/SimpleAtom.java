package org.forYoink.molecular.domain;

import org.springframework.data.annotation.Id;
import org.forYoink.api.model.molecular.Atom;
import org.forYoink.api.model.molecular.Coord;
import org.forYoink.api.model.molecular.Element;
import org.forYoink.api.model.molecular.RadialGrid;


/**
 * the domain model of atom
 *
 * - added id property to allow storage inside a database
 *   by using org.springframework.data
 * - added seqId property to allow separation into different
 *   molecules when creating a molecular system from pdbxml
 * - added two constructors (empty and +seqId)
 *
 * @author Min Zheng
 *
 */
public class SimpleAtom implements Atom {

    @Id
    public Long id;						// for storing in database

    protected int index;

    protected Element elementType;

    public Coord coordinate;

    private RadialGrid radial_grid;

    private int seqId;					// necessary to build molecules(atoms of the same molecule have the same seqId)

    public SimpleAtom() {               // necessary for database transaction (UNKNOWN REASON)
    }

    /**
     * constructor to create atoms from pdbxml files
     * @param index
     * @param elementType
     * @param coordinate
     * @param seqId
     */
    public SimpleAtom(int index, Element elementType, Coord coordinate, int seqId) {
        this.index = index;
        this.elementType = elementType;
        this.coordinate = coordinate;
        this.seqId = seqId;
    }

    public SimpleAtom(int index, Element elementType, Coord coordinate) {
        this.index = index;
        this.elementType = elementType;
        this.coordinate = coordinate;
    }

    /**
     * get the element type of the atom
     */
    @Override
    public Element getElementType() {
        return elementType;
    }

    /**
     * get the atomic index in molecular system
     */
    @Override
    public int getIndex() {
        return index;
    }

    /**
     * get the coordinate of the atom
     */
    @Override
    public Coord getCoordinate() {
        return coordinate;
    }

    /**
     * get the x coordinate of the atom
     */
    @Override
    public double getX3() {
        return this.coordinate.getCoords().getX();
    }

    /**
     * get the y coordinate of the atom
     */
    @Override
    public double getY3() {
        return this.coordinate.getCoords().getY();
    }

    /**
     * get the z coordinate of the atom
     */
    @Override
    public double getZ3() {
        return this.coordinate.getCoords().getZ();
    }

    /**
     * get the database id of the atom
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * get the seqId of the atom
     * @return
     */
    @Override
    public int getSeqId() {
        return seqId;
    }

    /**
     * set the radial grid
     */
    @Override
    public RadialGrid getRadialGrid() {

        return this.radial_grid;
    }

    /**
     * get the radial grid
     */
    @Override
    public void setRadialGrid(RadialGrid radial_grid) {

        this.radial_grid=radial_grid;
    }

    @Override
    public String toString() {
        return "SimpleAtom{" +
                "id=" + id +
                ", index=" + index +
                ", elementType=" + elementType +
                ", coordinate=" + coordinate +
                ", radial_grid=" + radial_grid +
                ", seqId=" + seqId +
                '}';
    }
}