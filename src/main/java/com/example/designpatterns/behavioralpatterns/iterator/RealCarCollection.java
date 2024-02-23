package com.example.designpatterns.behavioralpatterns.iterator;

import com.example.designpatterns.creationalpatterns.builder.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class RealCarCollection implements CarCollection{
    private List<Car> list;

    @Override
    public CarIterator createSportCarsIterator() {
        return new NormalOrderIterator(this);
    }

    @Override
    public CarIterator createFamilyCarsIterator() {
        return new InvertedOrderIterator(this);
    }
}
