package com.example.designpatterns.behavioralpatterns.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Editor {
    private String text;
    private String selection;

       public void deleteSelection(){
           text = text.replace(selection, "");
    }

}
