package com.example.designpatterns.behavioralpatterns.iterator;

import com.example.designpatterns.creationalpatterns.builder.Car;

import java.util.List;

public class NormalOrderIterator implements CarIterator {

    private final RealCarCollection collection;
    private int currentPosition;
    private List<Car> cache;

    public NormalOrderIterator(RealCarCollection collection) {
        this.collection = collection;
    }

    void lazyInit() {
        if (cache == null)
            cache = collection.getList();
    }

    @Override
    public boolean hasNext() {
        lazyInit();
        return currentPosition < cache.size();
    }

    @Override
    public Car getNext() {
        return cache.get(currentPosition++);
    }
}
