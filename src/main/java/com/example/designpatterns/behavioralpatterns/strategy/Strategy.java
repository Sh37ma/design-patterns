package com.example.designpatterns.behavioralpatterns.strategy;

public interface Strategy {

    boolean shouldExecute(char operation);
    int execute(int arg1, int arg2);
}
