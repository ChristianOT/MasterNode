package org.gradle.interfaces.service;

/**
 * Created by christian on 17/11/2016.
 */
public interface Factory<T,K> {
   K create(T t);
}
