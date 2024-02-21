package com.example.designpatterns.behavioralpatterns.chainofresponsibility;

import com.example.designpatterns.Pattern;

public class ChainOfResponsibilityClient implements Pattern {
    @Override
    public void triggerPattern() {
        Processor processorSpecial = new SpecialCharProcessor(null);
        Processor processorLetter = new LetterProcessor(processorSpecial);
        Processor processorNumber = new NumberProcessor(processorLetter);

        processorNumber.process('%');
    }
}
