package org.wallerlab.yoink.core.pdbml.domain;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity
public class Relationship {

	@GraphId
	private Long id;

	@StartNode
	private Protein protein;

	@EndNode 
	private Atom atom;
	
	
	
}
