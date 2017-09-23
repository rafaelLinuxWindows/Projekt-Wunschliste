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
public class Geschenk {

    private String person;
    private String bezeichnung;
    private String dringlichkeit;
    private String status;
    private String datum;
   
   public Geschenk( String person, String bezeichnung, String dringlichkeit, String status){
       this.person = person;
       this.bezeichnung = bezeichnung;
       this.dringlichkeit = dringlichkeit;
       this.status = status;
   }
   
   public Geschenk( String person, String bezeichnung, String dringlichkeit, String status, String datum){
       this.person = person;
       this.bezeichnung = bezeichnung;
       this.dringlichkeit = dringlichkeit;
       this.status = status;
       this.datum = datum;
   }
   
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getDringlichkeit() {
        return dringlichkeit;
    }

    public void setDringlichkeit(String dringlichkeit) {
        this.dringlichkeit = dringlichkeit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

}
