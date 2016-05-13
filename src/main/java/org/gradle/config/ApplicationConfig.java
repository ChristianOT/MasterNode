package org.gradle.config;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.support.Neo4jTemplate;

@Configuration
@EnableNeo4jRepositories(basePackages = "org.gradle.dataBaseRepositories")
public class ApplicationConfig extends Neo4jConfiguration{

	public ApplicationConfig() {
		setBasePackage("org.gradle.domain");
	}

	@Bean
	GraphDatabaseService graphDatabaseService() {
		return new GraphDatabaseFactory().newEmbeddedDatabase("newNeo4j.db");
	}

}
