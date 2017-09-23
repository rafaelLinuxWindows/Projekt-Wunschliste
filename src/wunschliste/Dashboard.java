/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wunschliste;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Rafael
 */
public class Dashboard {
    
    private final TableView<Ereignis> tablEreignisse = new TableView();
    private final TableView<Geschenk> tablResGeschenke = new TableView();
   
    
    public Node getDashboard(){
        
        ObservableList<Ereignis> data_ereignisse = FXCollections.observableArrayList(
            new Ereignis("Person1", "Ereignis1", "in 3 Tagen", "12.12.1900"),
            new Ereignis("Person2", "Ereignis2", "in 4 Tagen", "12.12.1800"),
            new Ereignis("Person3", "Ereignis3", "in 5 Tagen", "12.12.1700")
        );
        
         ObservableList<Geschenk> data_geschenk = FXCollections.observableArrayList(
            new Geschenk("Person1", "Geschenk1", "in 3 Tagen", "12.12.1900"),
            new Geschenk("Person2", "Geschenk2", "in 4 Tagen", "12.12.1800"),
            new Geschenk("Person3", "Geschenk3", "in 5 Tagen", "12.12.1700")
        );
         
         Label titel = new Label("Dashboard");
         titel.setFont(Font.font("Cambria", 32));
         
         //Für Ereignistabelle
        Label lbl_ereignisse = new Label("Ereignisse");
                
        TableColumn<Ereignis, String> wercol = new TableColumn<>("Wer");
        wercol.setCellValueFactory(
            new PropertyValueFactory<>("name"));
        
        TableColumn<Ereignis, String> wascol = new TableColumn<>("Was");
        wascol.setCellValueFactory(
            new PropertyValueFactory<>("ereignis"));
        
        TableColumn<Ereignis, String> wanncol = new TableColumn<>("Wann");
        wanncol.setCellValueFactory(
            new PropertyValueFactory<>("bis"));
        
        TableColumn<Ereignis, String> datumcol = new TableColumn<>("Datum");
        datumcol.setCellValueFactory(
            new PropertyValueFactory<>("datum"));
        
        tablEreignisse.setItems(data_ereignisse);
        tablEreignisse.setPrefHeight(98);
        tablEreignisse.setPrefWidth(279);
        tablEreignisse.getColumns().addAll(wercol,wascol,wanncol,datumcol);
        
        //Für Geschenketabelle
        Label lbl_res_geschenke = new Label("Reservierte Geschenke");
        
         TableColumn<Geschenk, String> fuercol = new TableColumn<>("Für");
        fuercol.setCellValueFactory(
            new PropertyValueFactory<>("person"));
        
        TableColumn<Geschenk, String> geschenkcol = new TableColumn<>("Geschenk");
        geschenkcol.setCellValueFactory(
            new PropertyValueFactory<>("bezcihnung"));
        
        TableColumn<Geschenk, String> zeitcol = new TableColumn<>("Zeit");
        zeitcol.setCellValueFactory(
            new PropertyValueFactory<>("dringlichkeit"));
        
        TableColumn<Geschenk, String> termincol = new TableColumn<>("Datum");
        termincol.setCellValueFactory(
            new PropertyValueFactory<>("stauts"));
        
        tablResGeschenke.setItems(data_geschenk);
        tablResGeschenke.setPrefHeight(98);
        tablResGeschenke.setPrefWidth(279);
        tablResGeschenke.getColumns().addAll(fuercol,geschenkcol,zeitcol,termincol);
        
        VBox vbox_ereignisse = new VBox();
        VBox vbox_resgeschenk = new VBox();
        
        vbox_ereignisse.getChildren().addAll(lbl_ereignisse,tablEreignisse);
        vbox_resgeschenk.getChildren().addAll(lbl_res_geschenke, tablResGeschenke);
        
        BorderPane borderpane = new BorderPane();
        
        Label placeholder = new Label("Platzhalter für den Kallender");
        
        BorderPane twoUnits = new BorderPane();
        twoUnits.setTop(titel);
        twoUnits.setLeft(vbox_ereignisse);
        twoUnits.setRight(vbox_resgeschenk);
        
        BorderPane calendarPane = new BorderPane();
        
        calendarPane.setCenter(placeholder);
        
        
        borderpane.setTop(twoUnits);
        borderpane.setBottom(calendarPane);
        
        return borderpane;
    }
}
