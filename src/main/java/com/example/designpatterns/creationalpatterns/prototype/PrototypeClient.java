package com.example.designpatterns.creationalpatterns.prototype;

import com.example.designpatterns.Pattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeClient implements Pattern {

    @Override
    public void triggerPattern() {
        Circle c1 = new Circle();
        c1.radius = 5;
        Square s1 = new Square();
        s1.arm = 12;

        List<Figure> list = new ArrayList<>();
        List<Figure> copyList = new ArrayList<>();
        list.add(c1);
        list.add(s1);

        for (Figure f : list) {
            var figure = f.clone();
            copyList.add(f);
            figure.x++;
            figure.y++;
            copyList.add(figure);
        }
        System.out.println(copyList);
    }
}
