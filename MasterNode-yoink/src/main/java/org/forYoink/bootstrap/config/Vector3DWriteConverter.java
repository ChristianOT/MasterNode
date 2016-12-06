package org.forYoink.bootstrap.config;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class Vector3DWriteConverter implements Converter<Vector3D, DBObject> {

    public DBObject convert(Vector3D source) {
        DBObject dbo = new BasicDBObject();
        dbo.put("x", source.getX());
        dbo.put("y", source.getY());
        dbo.put("z", source.getZ());
        return dbo;
    }
}