package com.example.designpatterns.behavioralpatterns.chainofresponsibility;

public class LetterProcessor extends ActualProcessor {

    public LetterProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(char message) {
        if(Character.isLetter(message)){
            System.out.println("Processing letter: " + message);
        } else {
            System.out.println("Forwarding processing");
            nextProcessor.process(message);
        }
    }
}
