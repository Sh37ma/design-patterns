package com.example.designpatterns.behavioralpatterns.strategy;

import com.example.designpatterns.Pattern;

import java.util.List;

public class StrategyClient implements Pattern {
    @Override
    public void triggerPattern() {

        List<Strategy> strategies = List.of(new AddStrategy(), new MinusStrategy(), new MultiplyStrategy());

        strategies.stream()
                .filter(s -> s.shouldExecute('*'))
                .findFirst()
                .ifPresent(s -> System.out.println(s.execute(4, 2)));

    }

}
