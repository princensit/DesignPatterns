package com.designpatterns.mvc.controller;

import com.designpatterns.mvc.model.Model;
import com.designpatterns.mvc.view.View;

public class Controller {

    private Model model;

    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
