package com.example.designpatterns.behavioralpatterns.chainofresponsibility;

public class SpecialCharProcessor extends ActualProcessor{
    public SpecialCharProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(char message) {
        System.out.println("Processing special character: " + message);
    }
}
