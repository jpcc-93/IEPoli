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
public class Usuario {
    private String name;
    private String lastName;
    private String id;
    private String mail;
    private String numberPhone;
    private boolean admin;
    private String user;
    private String pw;

    public Usuario(String name, String lastName, String id, String mail, String numbrePhone, boolean admin, String user, String pw) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.mail = mail;
        this.numberPhone = numbrePhone;
        this.admin = admin;
        this.user = user;
        this.pw = pw;
    }

    public Usuario() {
    }
    
    
    public void mostrarXconsola(){
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getName() );
        System.out.println("Apellido: " + getLastName() );
        System.out.println("mail: " + getMail() );
        System.out.println("numero Tel: " + getNumberPhone() );
        System.out.println("Admin: " + String.valueOf(isAdmin()) );
        System.out.println("User: " + getUser() );
        System.out.println("PW: " + getPw());
    }
    
    public void asignarData(String[] datos){
        this.setId(datos[0]); 
        this.setName(datos[1]);
        this.setLastName(datos[2]);
        this.setMail(datos[3]);
        this.setNumberPhone(datos[4]);
        this.setAdmin(Boolean.parseBoolean(datos[5]));
        this.setUser(datos[6]);
        this.setPw(datos[7]);
    }
    
    
    public Usuario[] cargarAlista(){
        int tamaño = 0;
        String rutaArchivo = "src/archivos/users.txt";
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
        Usuario[] user = new Usuario[tamaño];
        tamaño = 0;
        
         try {
            // Abrir el archivo para lectura
            FileReader fileReader = new FileReader(rutaArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leer el archivo línea por línea
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                Usuario nuevo = new Usuario();
                datos = linea.split(",");
                nuevo.asignarData(datos);
                user[tamaño] = nuevo;
                tamaño ++;
            }

            // Cerrar el BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        return user;
    }
    
    public Usuario[] cargarAlistaDeLoguin(){
        int tamaño = 0;
        String rutaArchivo = "src/archivos/users.txt";
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
        Usuario[] user = new Usuario[tamaño];
        tamaño = 0;
        
         try {
            // Abrir el archivo para lectura
            FileReader fileReader = new FileReader(rutaArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leer el archivo línea por línea
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                Usuario nuevo = new Usuario();
                datos = linea.split(",");
                nuevo.asignarData(datos);
                user[tamaño] = nuevo;
                tamaño ++;
            }

            // Cerrar el BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        return user;
    }



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
}
