package org.gradle.interfaces;

import java.util.List;

public interface Translator<O,I> {
	
	public List<O> translate(I i);

}
