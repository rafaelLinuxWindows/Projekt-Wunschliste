/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wunschliste;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Rafael
 */
public class Ereignisse {
    
    private final TableView<Ereignis> tablEreignisse = new TableView();
    
    public Node getEreignisse(){
        StackPane stackpane = new StackPane();
        Label titel = new Label("Ereignisse meiner Freunde");
        titel.setFont(Font.font("Cambria", 32));
        
        
         ObservableList<Ereignis> data_ereignisse = FXCollections.observableArrayList(
            new Ereignis("Person1", "Anlass1", "Geschenk1","Datum1","Ort1","Kommentar1"),
            new Ereignis("Person2", "Anlass2", "Geschenk2","Datum2","Ort2","Kommentar2"),
            new Ereignis("Person3", "Anlass3", "Geschenk3","Datum3","Ort3","Kommentar3"),
            new Ereignis("Person4", "Anlass4", "Geschenk4","Datum4","Ort4","Kommentar4")
        );
         
        TableColumn<Ereignis, String> personcol = new TableColumn<>("Wer");
        personcol.setCellValueFactory(
            new PropertyValueFactory<>("name"));
        
        TableColumn<Ereignis, String> anlasscol = new TableColumn<>("Was");
        anlasscol.setCellValueFactory(
            new PropertyValueFactory<>("ereignis"));
        
        TableColumn<Ereignis, String> geschenkcol = new TableColumn<>("Wann");
        geschenkcol.setCellValueFactory(
            new PropertyValueFactory<>("bis"));
        
        TableColumn<Ereignis, String> wanncol = new TableColumn<>("Datum");
        wanncol.setCellValueFactory(
            new PropertyValueFactory<>("datum"));

        TableColumn<Ereignis, String> ortcol = new TableColumn<>("Datum");
        ortcol.setCellValueFactory(
            new PropertyValueFactory<>("datum"));
            
        TableColumn<Ereignis, String> besonderescol = new TableColumn<>("Datum");
        besonderescol.setCellValueFactory(
            new PropertyValueFactory<>("datum"));
        
        tablEreignisse.setItems(data_ereignisse);
        tablEreignisse.getColumns().addAll(personcol,anlasscol,geschenkcol,wanncol,ortcol,besonderescol);
        
        
        //Damit Titel oben in der Mitte ist
        BorderPane borderpane = new BorderPane();
        StackPane stackpane2 = new StackPane();
        stackpane2.getChildren().addAll(titel);
        borderpane.setTop(stackpane2);
        borderpane.setCenter(tablEreignisse);
  
        stackpane.getChildren().addAll(borderpane);
        
        
        return stackpane;
    }
    
}
