package com.example.designpatterns.behavioralpatterns.command;

public class PasteCommand extends Command {
    public PasteCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        saveBackup();
        editor.setText(editor.getText() + application.getClipboard());
        return true;
    }
}
