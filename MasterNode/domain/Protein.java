package org.wallerlab.yoink.core.pdbml.domain;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Protein {
	
	private final static String OWNS = "OWNS";

	
	@GraphId
	private Long id;
	
	private String name;
	
	@Fetch
	@RelatedTo(type = OWNS, direction = Direction.OUTGOING)
	private Set<Protein> links = new HashSet<Protein>();

	@Fetch
	@RelatedTo(type = OWNS, direction = Direction.OUTGOING)
	private Set<Atom> atoms = new HashSet<Atom>();
	
/*	@Fetch
	@RelatedTo(type = OWNS, direction = Direction.OUTGOING)
	private Set<Atom> atoms = new HashSet<Atom>();
*/
	
	    public void addLink(Protein protein) {
	        this.links.add(protein);
	    }

	    public void addAtom(Atom atom) {
	        this.atoms.add(atom);
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	

		
}
