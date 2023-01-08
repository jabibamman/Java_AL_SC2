package com.poo.model.alsc2.app;

import com.poo.model.alsc2.model.PolygonRegular;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {}

    public static void main(String[] args) {
       PolygonRegular polygonRegular = new PolygonRegular(1, 10);

         System.out.println(polygonRegular.perimeter());


    }
}