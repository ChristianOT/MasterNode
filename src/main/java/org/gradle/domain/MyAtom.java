package org.gradle.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class MyAtom {

	@Id
	private String id;
	
	private String element;

	@Lob
	private Double xCoord;
	
	@Lob
	private Double yCoord;
	
	@Lob
	private Double zCoord;
	
	//public List<Double> coords = new ArrayList<Double>();
	
/*	public void addCoord(Double coord){
		this.coords.add(coord);
	}*/
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

/*	public List<Double> getCoords() {
		return coords;
	}

	public void setCoords(List<Double> coords) {
		this.coords = coords;
	}*/

	public Double getxCoord() {
		return xCoord;
	}

	public void setxCoord(Double xCoord) {
		this.xCoord = xCoord;
	}

	public Double getyCoord() {
		return yCoord;
	}

	public void setyCoord(Double yCoord) {
		this.yCoord = yCoord;
	}

	public Double getzCoord() {
		return zCoord;
	}

	public void setzCoord(Double zCoord) {
		this.zCoord = zCoord;
	}

	@Override
	public String toString() {
		return "Atom [id=" + id + ", element=" + element + /*", coords=" + coords + */"]";
	}
}
