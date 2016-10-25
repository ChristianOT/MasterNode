package org.forYoink.domain

import org.wallerlab.yoink.api.model.molecular.Coord
import org.wallerlab.yoink.api.model.molecular.Element
import spock.lang.Specification

/**
 * Created by christian on 19/10/2016.
 */
class TestSimpleAtom extends Specification{

    def "test constructor and getter"(){

        when:
        def coords = Mock(Coord)
        def atom = new SimpleAtom()
        def atom2 = new SimpleAtom(1,Element.H,coords)

        then:
        atom.getIndex() == 0
        atom.getElementType() == null
        atom.getCoordinate() == null

        atom2.getIndex() == 1
        atom2.getElementType() == Element.H
        atom2.getCoordinate() == coords

    }


}
