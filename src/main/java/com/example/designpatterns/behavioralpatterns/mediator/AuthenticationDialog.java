package com.example.designpatterns.behavioralpatterns.mediator;

import lombok.Setter;

@Setter
public class AuthenticationDialog implements Mediator {


    private CheckBox loginOrRegisterChkBx;
    private TextBox userNameAndPassword;
    private Button ok;

    public AuthenticationDialog() {
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof CheckBox && event.equals("check")) {
            if (loginOrRegisterChkBx.isChecked()) {
                System.out.println("\nSwitched to Login");
            } else {
                System.out.println("\nSwitched to Registration");
            }
        }

            if (sender instanceof Button && event.equals("click")) {
                if (loginOrRegisterChkBx.isChecked()) {
                    System.out.println("Trying to login");
                } else {
                    System.out.println("Registering");
                }
            }

        if (sender instanceof TextBox && event.equals("click")) {
            if (loginOrRegisterChkBx.isChecked()) {
                System.out.println("Inserting data for login");
            } else {
                System.out.println("Inserting data for register");
            }
        }
    }
}
