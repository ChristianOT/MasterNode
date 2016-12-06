package org.forYoink.molecular.domain

import org.forYoink.api.model.molecular.Atom
import org.forYoink.api.model.molecular.Coord
import org.forYoink.api.model.regionizer.Region
import spock.lang.Specification

/**
 * Created by christian on 19/10/2016.
 */
class TestSimpleMolecule extends Specification{

    def "test constructor"() {

        when:
        List<Atom> atoms
        def molecule = new SimpleMolecule()
        def molecule2 = new SimpleMolecule(1,atoms)

        then:
        molecule.getIndex()==0
        molecule.getAtoms()==null

        molecule2.getIndex()==1
        molecule2.getAtoms()==atoms
    }

    def "test getter and setter"() {
        when:
        def molecule = new SimpleMolecule()
        def coords = Mock(Coord)

        molecule.setName(Region.Name.QM_CORE_ADAPTIVE)
        molecule.setCenterOfMass(coords)

        then:
        molecule.getName()==Region.Name.QM_CORE_ADAPTIVE
        molecule.getCenterOfMass()==coords
    }
}
