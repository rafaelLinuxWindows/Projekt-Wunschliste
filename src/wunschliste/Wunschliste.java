/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wunschliste;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Rafael
 */
public class Wunschliste extends Application {
    
    BorderPane root = new BorderPane();
    Dashboard dashboard = new Dashboard();
    Ereignisse ereignisse = new Ereignisse();
    Geschenke geschenke = new Geschenke();
    Einstellungen einstellungen = new Einstellungen();

    
    @Override
    public void start(Stage primaryStage) {
        Navigationsbar navbar = new Navigationsbar(this);
        root.setTop(navbar.getNavigationsBar());
        
        //root.setCenter(dashboard.getDashboard());
        //root.setCenter(ereignisse.getEreignisse());
        //root.setCenter(geschenke.getGeschenke());
        root.setCenter(einstellungen.getEinstellungen());
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Wunschliste");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void SetDashboardScene(){

    }
    
    public void SetEreignisseScene(){

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
