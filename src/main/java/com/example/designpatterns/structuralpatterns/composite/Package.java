package com.example.designpatterns.structuralpatterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Package implements Element{

    private List<Element> elementsInPackage;

    @Override
    public int getPrice() {
        return elementsInPackage.stream().mapToInt(Element::getPrice).sum();
    }
}
