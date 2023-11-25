/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inenpoli;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author jpcc-
 */
public class Cita {
    
    
    private int numCita;
    private String date;
    private String hour;
    private String place;
    private String levelE;
    private String rol;
    private String observaciones;
    private boolean asesor;
    private Usuario participantes[];

    public Cita(int numCita, String date, String hour, String place, String levelE, String rol, String observaciones, boolean asesor, Usuario[] participantes) {
        this.numCita = numCita;
        this.date = date;
        this.hour = hour;
        this.place = place;
        this.levelE = levelE;
        this.rol = rol;
        this.observaciones = observaciones;
        this.asesor = asesor;
        this.participantes = participantes;
    }

    public Cita() {
    }
    
    
    public void asignarData(String[] datos){
        this.setNumCita(Integer.parseInt(datos[0])); 
        this.setDate(datos[1]);
        this.setHour(datos[2]);
        this.setPlace(datos[3]);
        this.setLevelE(datos[4]);
        this.setRol(datos[5]);
        this.setObservaciones(datos[6]);
        this.setAsesor(Boolean.parseBoolean(datos[7]));
    }
    
    
    public void mostrarXconsola(){
        System.out.println("numero cita: " + getNumCita() );
        System.out.println("fecha: " + getDate() );
        System.out.println("hora: " + getHour() );
        System.out.println("lugar: " + getPlace() );
        System.out.println("nivel: " + getLevelE() );
        System.out.println("Rol: " + getRol() );
        System.out.println("observaciones: " + getObservaciones() );
        System.out.println("Asesor: " + String.valueOf(isAsesor()) );
    }
    
    
    public Cita[] cargarAlista(){
        int tamaño = 0;
        String rutaArchivo = "C:\\Users\\jpcc-\\OneDrive\\Documentos\\NetBeansProjects\\IEPoli\\src\\archivos\\citas.txt";
        String datos[] = new String[8];
        
        try {
            // Abrir el archivo para lectura
            FileReader fileReader = new FileReader(rutaArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leer el archivo línea por línea
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                tamaño ++;
                
            }

            // Cerrar el BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(tamaño);
        Cita[] citas = new Cita[tamaño];
        tamaño = 0;
        
         try {
            // Abrir el archivo para lectura
            FileReader fileReader = new FileReader(rutaArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leer el archivo línea por línea
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                Cita nueva = new Cita();
                datos = linea.split(",");
                nueva.asignarData(datos);
                citas[tamaño] = nueva;
                tamaño ++;
            }

            // Cerrar el BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        return citas;
    }
    
    
    

    public Usuario[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Usuario[] participantes) {
        this.participantes = participantes;
    }

    

    public int getNumCita() {
        return numCita;
    }

    public void setNumCita(int numCita) {
        this.numCita = numCita;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isAsesor() {
        return asesor;
    }

    public void setAsesor(boolean asesor) {
        this.asesor = asesor;
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
