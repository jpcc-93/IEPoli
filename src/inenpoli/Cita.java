/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inenpoli;

/**
 *
 * @author jpcc-
 */
public class Cita {
    
    private String date;
    private String hour;
    private String place;
    private String levelE;
    private String rol;

    public Cita(String date, String hour, String place, String levelE, String rol) {
        this.date = date;
        this.hour = hour;
        this.place = place;
        this.levelE = levelE;
        this.rol = rol;
    }
    
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getLevelE() {
        return levelE;
    }

    public void setLevelE(String levelE) {
        this.levelE = levelE;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
