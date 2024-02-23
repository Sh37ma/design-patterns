package com.example.designpatterns.behavioralpatterns.iterator;

import com.example.designpatterns.creationalpatterns.builder.Car;

import java.util.List;

public class InvertedOrderIterator implements CarIterator {
    private final RealCarCollection collection;
    private int currentPosition;
    private List<Car> cache;

    public InvertedOrderIterator(RealCarCollection collection) {
        this.collection = collection;
    }

    void lazyInit() {
        if (cache == null) {
            cache = collection.getList();
            currentPosition = collection.getList().size() - 1;
        }
    }

    @Override
    public boolean hasNext() {
        lazyInit();
        return currentPosition >= 0;
    }

    @Override
    public Car getNext() {
        return cache.get(currentPosition--);
    }

}
