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
public class ClaseDePractica {
    public static void main(String[] args) {
        String nombre;
        int edad;
        
        
        nombre = JOptionPane.showInputDialog( null ,"ingrese el nombre");
        JOptionPane.showMessageDialog(null,"hola soy "+nombre);
        
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la edad"));
        JOptionPane.showMessageDialog(null, "tengo "+ edad + "anios");
        
    }
    
    
}
