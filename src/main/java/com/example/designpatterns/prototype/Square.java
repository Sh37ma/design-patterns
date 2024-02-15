package com.example.designpatterns.prototype;

public class Square extends  Figure{

    int arm;

    public Square(){}

    public Square(Square source) {
        super(source);
        arm = source.arm;
    }

    @Override
    protected Square clone() {
        return new Square(this);
    }

    @Override
    public String toString() {
        return "Square{" +
                "arm=" + arm +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
