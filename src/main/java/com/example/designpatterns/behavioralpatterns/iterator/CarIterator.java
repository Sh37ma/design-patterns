package com.example.designpatterns.behavioralpatterns.iterator;

import com.example.designpatterns.creationalpatterns.builder.Car;

public interface CarIterator {
    boolean hasNext();
    Car getNext();
}
