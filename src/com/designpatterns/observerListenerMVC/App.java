package com.designpatterns.observerListenerMVC;

import javax.swing.*;

import com.designpatterns.observerListenerMVC.controller.Controller;
import com.designpatterns.observerListenerMVC.model.Model;
import com.designpatterns.observerListenerMVC.view.View;

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

        view.setLoginListener(controller);
    }

}
