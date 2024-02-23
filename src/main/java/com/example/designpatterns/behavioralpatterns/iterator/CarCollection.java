package com.example.designpatterns.behavioralpatterns.iterator;

public interface CarCollection {
    CarIterator createSportCarsIterator();
    CarIterator createFamilyCarsIterator();
}
