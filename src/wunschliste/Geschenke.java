/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wunschliste;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Rafael
 */
public class Geschenke {
    
    private final TableView<Geschenk> tablResGeschenke = new TableView();
    private final TableView<EigeneGeschenke> tablEigGeschenke = new TableView();
    
    public Node getGeschenke(){
        
         ObservableList<Geschenk> data_geschenk = FXCollections.observableArrayList(
            new Geschenk("Person1", "Geschenk1", "in 3 Tagen","           " ,"12.12.1900"),
            new Geschenk("Person2", "Geschenk2", "in 4 Tagen","           " , "12.12.1800"),
            new Geschenk("Person3", "Geschenk3", "in 5 Tagen","           " , "12.12.1700")
        );
         
         ObservableList<EigeneGeschenke> data_eigen_geschenk = FXCollections.observableArrayList(
            new EigeneGeschenke("Wunsch1", "Lange Beschreibung 1", "Kommentar1","1"),
            new EigeneGeschenke("Wunsch2", "Lange Beschreibung 2", "Kommentar2","2"),
            new EigeneGeschenke("Wunsch3", "Lange Beschreibung 3", "Kommentar3","3"),
            new EigeneGeschenke("Wunsch4", "Lange Beschreibung 4", "Kommentar4","4"),
            new EigeneGeschenke("Wunsch5", "Lange Beschreibung 5", "Kommentar5","5")
        );
        
        VBox vbox = new VBox();
        
        //Tabelle der Reservierten Geschenke
        Label lbl_res_geschenke = new Label("Reservierte Geschenke");
        
         TableColumn<Geschenk, String> fuercol = new TableColumn<>("Für");
        fuercol.setCellValueFactory(
            new PropertyValueFactory<>("person"));
        
        TableColumn<Geschenk, String> geschenkcol = new TableColumn<>("Geschenk");
        geschenkcol.setCellValueFactory(
            new PropertyValueFactory<>("bezeichnung"));
        
        TableColumn<Geschenk, String> zeitcol = new TableColumn<>("Datum");
        zeitcol.setCellValueFactory(
            new PropertyValueFactory<>("datum"));
        
        TableColumn<Geschenk, String> termincol = new TableColumn<>("Besorgt?");
        termincol.setCellValueFactory(
            new PropertyValueFactory<>("stauts"));
        
        tablResGeschenke.setItems(data_geschenk);
        tablResGeschenke.setPrefWidth(400);
        tablResGeschenke.getColumns().addAll(fuercol,geschenkcol,zeitcol,termincol);
        
        //Tabelle der eigenen Geschenke
        Label lbl_eigene_geschenke = new Label("Eigenen Wunschliste");
        
        TableColumn<EigeneGeschenke, String> bezeichnungcol = new TableColumn<>("Bezeichnung");
        bezeichnungcol.setCellValueFactory(
            new PropertyValueFactory<>("bezeichnung"));
        
        TableColumn<EigeneGeschenke, String> beschreibungcol = new TableColumn<>("Beschreibung");
        beschreibungcol.setCellValueFactory(
            new PropertyValueFactory<>("beschreibung"));
        
        TableColumn<EigeneGeschenke, String> kommentarcol = new TableColumn<>("Kommentar");
        kommentarcol.setCellValueFactory(
            new PropertyValueFactory<>("kommentar"));
        
        TableColumn<EigeneGeschenke, String> checkcol = new TableColumn<>("Besorgt?");
        checkcol.setCellValueFactory(
            new PropertyValueFactory<>("stauts"));
        
        tablEigGeschenke.setItems(data_eigen_geschenk);
        tablEigGeschenke.setPrefWidth(400);
        tablEigGeschenke.getColumns().addAll(bezeichnungcol,beschreibungcol,kommentarcol,checkcol);
        
        VBox vbox_geschenke = new VBox();
        vbox_geschenke.getChildren().addAll(lbl_res_geschenke,tablResGeschenke);
        
        VBox vbox_eigengeschenke = new VBox();
        vbox_eigengeschenke.getChildren().addAll(lbl_eigene_geschenke,tablEigGeschenke);
        
        BorderPane main = new BorderPane();
        VBox titelbox = new VBox();
        Label titel = new Label("Überschrift");

        titelbox.getChildren().addAll(new Separator(Orientation.HORIZONTAL),titel,new Separator(Orientation.HORIZONTAL));
        main.setTop(titelbox);
        main.setCenter(new Separator(Orientation.VERTICAL));
        main.setRight(vbox_geschenke);
        main.setLeft(vbox_eigengeschenke);

        return main;
    }
}
