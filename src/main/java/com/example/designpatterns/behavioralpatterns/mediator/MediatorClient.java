package com.example.designpatterns.behavioralpatterns.mediator;

import com.example.designpatterns.Pattern;

public class MediatorClient implements Pattern {
    @Override
    public void triggerPattern() {
        AuthenticationDialog authenticationDialog = new AuthenticationDialog();
        CheckBox checkBox = new CheckBox(authenticationDialog);
        Button button = new Button(authenticationDialog);
        TextBox textBox = new TextBox(authenticationDialog);

        authenticationDialog.setUserNameAndPassword(textBox);
        authenticationDialog.setLoginOrRegisterChkBx(checkBox);
        authenticationDialog.setOk(button);

        checkBox.check();
        checkBox.check();
        textBox.click();
        button.click();
        checkBox.check();
        textBox.click();
        button.click();
    }
}
