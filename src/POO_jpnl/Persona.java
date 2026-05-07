/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_jpnl;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Persona {
    
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void persona (){
        
        nombre=JOptionPane.showInputDialog(null,"Ingrese el Nombre del la persona:");
        
        
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad de la persona:"));
    }
    void Mayor(){
        
        if(edad >= 18){
            JOptionPane.showMessageDialog(null, true);
        }
        else {
            JOptionPane.showMessageDialog(null, false);
        }
    }
}
