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
public class Ereignis {

    
    
    private String name;
    private String ereignis;
    private String bis;
    private String datum;
    private String ort;
    private String besonderes;
    

    
    public Ereignis(String name, String ereignis, String bis, String datum){
        this.name = name;
        this.ereignis = ereignis;
        this.bis = bis;
        this.datum = datum;
    }
    
     public Ereignis(String name, String ereignis, String bis, String datum, String ort, String besonderes){
        this.name = name;
        this.ereignis = ereignis;
        this.bis = bis;
        this.datum = datum;
        this.ort = ort;
        this.besonderes = besonderes;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEreignis() {
        return ereignis;
    }

    public void setEreignis(String ereignis) {
        this.ereignis = ereignis;
    }

    public String getBis() {
        return bis;
    }

    public void setBis(String bis) {
        this.bis = bis;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
    
}
