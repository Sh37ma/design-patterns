package com.example.designpatterns.behavioralpatterns.command;

public class UndoCommand extends Command {

    public UndoCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        application.undo();
        return false;
    }
}
