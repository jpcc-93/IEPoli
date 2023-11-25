/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inenpoli;

import GUI.Inicio;

/**
 *
 * @author Pablo U
 */
public class InEnpoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pruebas de manejo de clases
        Cita citas = new Cita();
        Cita vecCitas[];
        vecCitas = citas.cargarAlista();
        

        
        
        
        
        //Se crea por medio de el paquete GUI las interfaces graficas
        
       
        //Se instancia la ventana
        Inicio inicio = new Inicio();
         //se usa esta linea para que aparezca en el centro de la pantalla la aplicacion
        inicio.setLocationRelativeTo(null);
        //Se muestra la ventana
        inicio.setVisible(true);
    }
    
}
