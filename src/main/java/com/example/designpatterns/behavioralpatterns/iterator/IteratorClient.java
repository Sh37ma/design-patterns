package com.example.designpatterns.behavioralpatterns.iterator;

import com.example.designpatterns.Pattern;
import com.example.designpatterns.creationalpatterns.builder.Car;

import java.util.ArrayList;
import java.util.List;

public class IteratorClient implements Pattern {
    @Override
    public void triggerPattern() {

        List<Car> list = new ArrayList<>();
        list.add(new Car("car", "V8", "4", "tinted"));
        list.add(new Car("car2", "V6", "4", "transparent"));
        list.add(new Car("car3", "V6", "4", "transparent"));
        list.add(new Car("car4", "V6", "4", "transparent"));
        list.add(new Car("car5", "V8", "2", "tinted"));
        list.add(new Car("car6", "V8", "2", "tinted"));

        RealCarCollection realCarCollection = new RealCarCollection(list);

        System.out.println("Normal order");
        CarIterator carIterator = realCarCollection.createSportCarsIterator();
        while (carIterator.hasNext()) {
            System.out.println(carIterator.getNext());
        }

        System.out.println("Reverted order:");
        carIterator = realCarCollection.createFamilyCarsIterator();
        while (carIterator.hasNext()) {
            System.out.println(carIterator.getNext());
        }
    }
}
