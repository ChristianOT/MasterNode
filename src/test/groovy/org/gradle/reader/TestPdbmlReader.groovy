package org.gradle.reader

import org.gradle.pdbml.IDatablockType
import org.gradle.pdbml.v42.generated.DatablockType
import org.gradle.service.reader.PdbmlFileReader
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import spock.lang.Specification

class TestPdbmlReader extends Specification{
	
	def "testing read()"(){
		
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = pathMatchinResolver.getResources("file:./src/main/resources/org/5a0c.xml");

		def versionType = Mock(IDatablockType)

		versionType.getClass() >> DatablockType

		when:
		def reader = new PdbmlFileReader(resources[0])

		then:
		'4Y1G' == reader.read().getDatablockName()

	}

}
