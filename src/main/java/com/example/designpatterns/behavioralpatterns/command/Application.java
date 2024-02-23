package com.example.designpatterns.behavioralpatterns.command;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Application {
    private String clipboard;
    private Editor editor;
    private CommandHistory history;

    public Application(String clipboard, Editor editor, CommandHistory history) {
        this.clipboard = clipboard;
        this.editor = editor;
        this.history = history;
    }

    public void executeCommand(Command command){
        if(command.execute())
            history.push(command);
    }

    public void undo(){
        Command command = history.pop();
        if(command != null) {
            command.undo();
        }
    }
}
