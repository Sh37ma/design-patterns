package com.example.designpatterns.prototype;

public class Circle extends Figure{
    int radius;

    public Circle(){}

    public Circle(Circle source){
        super(source);
        radius = source.radius;
    }

    @Override
    protected Circle clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
