/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_jpnl;

import javax.swing.JOptionPane;
/**
 *
 * @author LABO B 9
 */
public class Alumno {
    String nombre;
    int nota,notas;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    void alumno (){
        JOptionPane.showInputDialog(null,"Ingrese el Nombre del alumno:");
        
        
        
        notas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nota del alumno:"));
    }
    void aprovacion(){
        if (notas >= 6){
            JOptionPane.showMessageDialog(null, "EL alumno aprobo");
        }
        else{
            JOptionPane.showMessageDialog(null, "El alumno desaproboo");
        }
    }
        
}
