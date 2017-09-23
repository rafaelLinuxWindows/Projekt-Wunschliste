/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wunschliste;

import java.io.File;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Rafael
 */
public class Navigationsbar {
    private Stage primaryStage;
    private Scene scene;
    private Wunschliste wunschliste;
    
public Navigationsbar(Wunschliste wunschliste){
    this.wunschliste = wunschliste;
}
    
    public Node getNavigationsBar(){
        
        Image image = new Image(getClass().getResourceAsStream("WunschlisteLogo.PNG"));
        
        ImageView logo = new ImageView();
        logo.setFitWidth(60.0);
        logo.setFitHeight(50.0);
        logo.setImage(image);
        
         Image image2 = new Image(getClass().getResourceAsStream("User.PNG"));
        
        ImageView user = new ImageView();
        user.setFitWidth(60.0);
        user.setFitHeight(50.0);
        user.setImage(image2);
        
        Button btn_dashboard = new Button("Dashboard");
        btn_dashboard.setOnAction(event -> {
            wunschliste.SetDashboardScene();
        });
        
        Button btn_erigniss = new Button("Ereignisse");        
        //btn_erigniss.setOnAction(event -> {
        //    wunschliste.SetEreignisseScene();
        //});
        
        Button btn_geschenke = new Button("Geschenke");
        //btn_geschenke.setOnAction(event -> {
        //    wunschliste.SetGeschenkeScene();
        //});
        
        
        ObservableList<String> links = 
        FXCollections.observableArrayList(
        "Freunde",
        "Einstellungen",
        "Ausloggen"
        );
        ComboBox comboBox = new ComboBox(links);
        
        
        
        HBox btn_box = new HBox();
        VBox vbox = new VBox();
        BorderPane borderpane = new BorderPane();
        
        btn_box.getChildren().addAll(btn_dashboard,btn_erigniss,btn_geschenke);
        vbox.getChildren().addAll(user,comboBox);

        borderpane.setCenter(btn_box);
        borderpane.setLeft(logo);
        borderpane.setRight(vbox);
        
        return borderpane;
    }    
}
