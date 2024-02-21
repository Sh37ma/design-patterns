package com.example.designpatterns.behavioralpatterns.chainofresponsibility;

public abstract class ActualProcessor implements Processor{
    protected Processor nextProcessor;

    public ActualProcessor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public abstract void process(char message);
}
