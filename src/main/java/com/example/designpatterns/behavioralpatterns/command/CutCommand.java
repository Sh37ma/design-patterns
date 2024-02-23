package com.example.designpatterns.behavioralpatterns.command;

public class CutCommand extends Command {
    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        saveBackup();
        application.setClipboard(editor.getSelection());
        editor.deleteSelection();
        return true;
    }

}
