/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wunschliste;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Rafael
 */
public class Einstellungen {
    
    public Node getEinstellungen(){
        
        StackPane stackpane = new StackPane();
        Label lbl_email = new Label("E-Mail");
        Label lbl_Nutzername = new Label("Nutzername");
        Label lbl_vorname = new Label("Vorname");
        Label lbl_nachname = new Label("Nachname");
        Label lbl_alterspasswort = new Label("Altes Passwort");
        Label lbl_neuespasswort = new Label("Neues Passwort");
        Label lbl_passwortnochmal = new Label("Passwort bestätigen");
        
        Button einstellungenspeichen = new Button("Einstellungen speichern");
        Button passwortaendern = new Button("Passwort ändern");
        
        
        
        /**
        
        VBox main = new VBox();   
        HBox innermain = new HBox();
        main.getChildren().add(innermain);
        
        VBox innerleft = new VBox();
        VBox innerright = new VBox();
        innermain.getChildren().addAll(innerleft,innerright);

        innerleft.getChildren().addAll(lbl_email,lbl_Nutzername,lbl_vorname,lbl_nachname,lbl_alterspasswort,lbl_neuespasswort,lbl_passwortnochmal);
        
        for(int i = 0; i < 7 ; i++) {
            innerright.getChildren().add(new TextField());
        }
        stackpane.getChildren().add(main);**/
        VBox vbox = new VBox();
        
        
        GridPane mainSettings = new GridPane();
        vbox.getChildren().add(mainSettings);
        
        mainSettings.add(lbl_email, 0, 0);
        mainSettings.add(new TextField(), 1, 0);
        mainSettings.add(lbl_Nutzername, 0, 1);
        mainSettings.add(new TextField(), 1, 1);
        mainSettings.add(lbl_vorname, 0, 2);
        mainSettings.add(new TextField(), 1, 2);
        mainSettings.add(lbl_nachname, 0, 3);
        mainSettings.add(new TextField(), 1, 3);
        
        vbox.getChildren().add(einstellungenspeichen);
        
        GridPane passwordSettings = new GridPane();
        vbox.getChildren().add(passwordSettings);
        
        passwordSettings.add(lbl_alterspasswort, 0, 0);
        passwordSettings.add(new TextField(), 1, 0);
        passwordSettings.add(lbl_neuespasswort, 0, 1);
        passwordSettings.add(new TextField(), 1, 1);
        passwordSettings.add(lbl_passwortnochmal, 0, 2);
        passwordSettings.add(new TextField(), 1, 2);
        
        vbox.getChildren().add(passwortaendern);
        
        stackpane.getChildren().add(vbox);
        return stackpane;
    }
    
}
