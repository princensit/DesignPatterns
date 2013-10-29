package com.designpatterns.observerListenerMVC.controller;

import com.designpatterns.observerListenerMVC.view.LoginFormEvent;
import com.designpatterns.observerListenerMVC.view.LoginListener;
import com.designpatterns.observerListenerMVC.model.Model;
import com.designpatterns.observerListenerMVC.view.View;

public class Controller implements LoginListener {

    private Model model;

    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
    }
}
