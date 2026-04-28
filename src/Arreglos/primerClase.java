/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author LABO B 9
 */

import  javax.swing.JOptionPane;
public class primerClase {
    public static void main(String[] args) {
        
    String [] Mochila = {"goma","tijera","lapicera","fibra","crayon"};
        
    
    JOptionPane.showMessageDialog(null,  Mochila[1]+" "+Mochila[3]); 
    
        for (int i = 0; i < Mochila.length; i++) {
        
             JOptionPane.showMessageDialog(null,  Mochila[i]);
             
             
        }
    }
}
