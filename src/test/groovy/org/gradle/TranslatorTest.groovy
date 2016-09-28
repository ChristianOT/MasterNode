package org.gradle

import org.gradle.interfaces.DatablockTypeInterface;
import org.gradle.reader.PdbmlFileReader
import org.gradle.yoinkTranslator.AtomTranslator
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.wallerlab.yoink.api.model.molecular.Atom
import org.wallerlab.yoink.api.model.molecular.Coord
import org.wallerlab.yoink.api.model.molecular.Element
import org.wallerlab.yoink.api.model.molecular.RadialGrid;
import org.wallerlab.yoink.api.service.math.Vector;

import org.wallerlab.yoink.molecular.domain.SimpleAtom;

import spock.lang.Specification

class TranslatorTest extends Specification {

	def "testing SimpleAtom"(){
		def coordinates=Mock(Coord)
		def coords=Mock(Vector)
		coords.getX()>>1.0
		coords.getY()>>1.0
		coords.getZ()>>1.0
		coordinates.getCoords()>>coords
		def index=1
		def element=Element.H
		when:'construct SimpleAtom'
		def atom = new SimpleAtom(index,element,coordinates)
		then:
		assert atom.getX3()!=null
		atom.getX3()==1.0
		atom.getY3()==1.0
		atom.getZ3()==1.0
	}
	
	def "testing AtomTranslator"(){
		def pathMatchinResolver = new PathMatchingResourcePatternResolver();
		def resources = pathMatchinResolver.getResources("file:./src/main/resources/org/gradle/1IDQ.xml");
		def reader=new PdbmlFileReader()
		def dti=reader.readv40(resources[0])
		when:
		def atomTranslator = new AtomTranslator()
		then:
		assert dti!=null
		assert atomTranslator.translate(dti) instanceof List<Atom>
	}
}
