/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wunschliste;

/**
 *
 * @author Rafael
 */
public class EigeneGeschenke {

    
    
    private String bezeichnung;
    private String beschreibung;
    private String kommentar;
    private String priorität;
   
   public EigeneGeschenke(String bezeichnung, String beschreibung, String kommentar, String priorität){
    this.bezeichnung = bezeichnung;
    this.beschreibung = beschreibung;
    this.kommentar = kommentar;
    this.priorität = priorität;
   }
    
   public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public String getPriorität() {
        return priorität;
    }

    public void setPriorität(String priorität) {
        this.priorität = priorität;
    }
}
