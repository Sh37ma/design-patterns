package com.example.designpatterns.behavioralpatterns.chainofresponsibility;

public class NumberProcessor extends ActualProcessor{
    public NumberProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(char message) {
        if(Character.isDigit(message)){
            System.out.println("Processing digit: " + message);
        } else {
            System.out.println("Forwarding processing");
            nextProcessor.process(message);
        }
    }
}
