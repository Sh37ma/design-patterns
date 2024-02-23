package com.example.designpatterns.behavioralpatterns.command;

public abstract class Command {
protected Application application;
protected Editor editor;
protected String backup;

    public Command(Application application, Editor editor) {
        this.application = application;
        this.editor = editor;
    }


    protected void saveBackup(){
        backup = editor.getText();
    }

    protected void undo(){
        editor.setText(backup);
    }

    abstract boolean execute();

}
