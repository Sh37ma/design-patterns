package com.example.designpatterns.behavioralpatterns.mediator;

import lombok.Getter;

@Getter
public class CheckBox extends Component{
    private boolean checked;
    public CheckBox(Mediator dialog) {
        super(dialog);
    }

    void check(){
        checked = !checked;
        dialog.notify(this, "check");
    }
}
