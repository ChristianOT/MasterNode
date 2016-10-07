package org.gradle.interfaces;

import java.util.Set;

public interface Translator<O, I> {

    Set<O> translate(I i);

}
