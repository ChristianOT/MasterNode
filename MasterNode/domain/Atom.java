package org.wallerlab.yoink.core.pdbml.domain;

import java.util.Set;
import java.util.HashSet;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Atom {

	@GraphId
	private Long id;
		
	private String element;
	
	private Set<Double> coords = new HashSet<Double>();
	
	private Double occupancy;

	public void addCoord(Double coord){
		this.coords.add(coord);
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the coords
	 */
	public Set<Double> getCoords() {
		return coords;
	}



	/**
	 * @param coords the coords to set
	 */
	public void setCoords(Set<Double> coords) {
		this.coords = coords;
	}



	/**
	 * @return the occupancy
	 */
	public Double getOccupancy() {
		return occupancy;
	}



	/**
	 * @param occupancy the occupancy to set
	 */
	public void setOccupancy(Double occupancy) {
		this.occupancy = occupancy;
	}

	/**
	 * @return the element
	 */
	public String getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(String element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "Atom [id=" + id + ", element=" + element + ", coords=" + coords
				+ ", occupancy=" + occupancy + "]";
	}

	
}
