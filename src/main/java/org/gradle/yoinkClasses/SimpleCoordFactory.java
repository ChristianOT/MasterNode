package org.gradle.yoinkClasses;

import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.service.Factory;
import org.wallerlab.yoink.api.service.math.Vector;
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory;
import org.wallerlab.yoink.molecular.domain.SimpleCoord;

@Service
public class SimpleCoordFactory implements Factory<Coord, double[]> {

    private SimpleVector3DFactory myVector3D;

    public SimpleCoordFactory() {
    }

    public SimpleCoordFactory(SimpleVector3DFactory myVector3D) {
        this.myVector3D = myVector3D;
    }

    public Coord create() {
        Vector coordVector = this.myVector3D.create(0.0D, 0.0D, 0.0D);
        SimpleCoord newCooord = new SimpleCoord(coordVector);
        return newCooord;
    }

    public Coord create(double[] d) {
        Vector coordVector = this.myVector3D.create(d);
        SimpleCoord newCooord = new SimpleCoord(coordVector);
        return newCooord;
    }
}
