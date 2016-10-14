package org.gradle.interfaces.service;

import org.springframework.stereotype.Service;

@Service
public interface Translator<T, K> {

    T translate(K k);

}
