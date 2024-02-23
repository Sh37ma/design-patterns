package com.example.designpatterns.behavioralpatterns.command;

import com.example.designpatterns.Pattern;

public class CommandClient implements Pattern {
    @Override
    public void triggerPattern() {
        Editor editor = new Editor();
        editor.setText("Some text in editor");
        editor.setSelection( editor.getText().substring(0, 5));

        CommandHistory commandHistory = new CommandHistory();
        Application application = new Application("", editor, commandHistory);

        Command copy = new CopyCommand(application, editor);
        Command paste = new PasteCommand(application, editor);
        Command undo = new UndoCommand(application, editor);
        Command cut = new CutCommand(application, editor);

        System.out.println(editor.getText());
        application.executeCommand(cut);
        System.out.println(editor.getText());
        application.executeCommand(paste);
        System.out.println(editor.getText());
        application.executeCommand(copy);
        application.executeCommand(paste);
        System.out.println(editor.getText());
        application.executeCommand(undo);
        System.out.println(editor.getText());
    }
}
