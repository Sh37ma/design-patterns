package com.example.designpatterns.prototype;

public abstract class Figure {
    protected int x, y;

    public Figure() {
    }

    public Figure(Figure source) {
        this();
        x = source.x;
        y = source.y;
    }

    @Override
    abstract protected Figure clone();

    @Override
    abstract public String toString();
}
