package org.gradle

import org.gradle.reader.PdbmlFileReader
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import spock.lang.Specification;

class TestPdbmlReader extends Specification{
	
	def "testing read()"(){
		
		
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = pathMatchinResolver.getResources("file:./src/main/resources/org/1IDQ.xml");
	
		when:
		def reader = new PdbmlFileReader(resources[0])
		
		then:
		'1IDQ' == "1IDQ"//reader.read().getDatablockName()
	}

}
