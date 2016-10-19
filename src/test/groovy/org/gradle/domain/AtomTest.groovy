package org.gradle.domain

import spock.lang.Specification

/**
 * Created by christian on 11/10/2016.
 */
class AtomTest extends Specification {

    def atom = new Atom()

    def "test constructor"() {

        when:
        def atom = new Atom()
        def atom2 = new Atom("H",1.0,2.5,3.3,"100","ASP","HOH","A")

        then:
        atom != null
        atom2.toString() == "Atom [index=100, element=H, groupPDBx=ASP, labelCompId=HOH, chain=A, x=1.0, y=2.5, z=3.3]"
    }

    def "test setter"() {

        when:
        atom.setChain("A")
        atom.setElement("H")
        atom.setGroupPDBx("ASP")
        atom.setIndex("100")
        atom.setLabelCompId("HOH")
        atom.setX(1.0)
        atom.setY(2.5)
        atom.setZ(3.3)

        then:
        atom.chain == "A"
        atom.element == "H"
        atom.groupPDBx == "ASP"
        atom.index == "100"
        atom.labelCompId == "HOH"
        atom.x == 1.0
        atom.y == 2.5
        atom.z == 3.3
    }

    def "test getter"() {

        when:
        atom.setChain("A")
        atom.setElement("H")
        atom.setGroupPDBx("ASP")
        atom.setIndex("100")
        atom.setLabelCompId("HOH")
        atom.setChain("A")
        atom.setX(1.0)
        atom.setY(2.5)
        atom.setZ(3.3)

        then:
        atom.getChain() == "A"
        atom.getElement() == "H"
        atom.getGroupPDBx() == "ASP"
        atom.getIndex() == "100"
        atom.getLabelCompId() == "HOH"
        atom.getX() == 1.0
        atom.getY() == 2.5
        atom.getZ() == 3.3
    }

    def "test toString"() {

        when:
        atom.setChain("A")
        atom.setElement("H")
        atom.setGroupPDBx("ASP")
        atom.setIndex("100")
        atom.setLabelCompId("HOH")
        atom.setX(1.0)
        atom.setY(2.5)
        atom.setZ(3.3)

        then:
        atom.toString() == "Atom [index=100, element=H, groupPDBx=ASP, labelCompId=HOH, chain=A, x=1.0, y=2.5, z=3.3]"

    }
}
