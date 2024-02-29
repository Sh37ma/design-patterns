package com.example.designpatterns.behavioralpatterns.strategy;

public class AddStrategy implements Strategy{
    @Override
    public boolean shouldExecute(char operation) {
        return operation == '+';
    }

    @Override
    public int execute(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
