package com.designpatterns.mvc;

import javax.swing.*;

import com.designpatterns.mvc.controller.Controller;
import com.designpatterns.mvc.model.Model;
import com.designpatterns.mvc.view.View;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp() {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
    }

}
