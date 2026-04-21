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
public class Producto {
    
    int precio;
    String nombre;

    public Producto(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
    
    void Dialogo(){
        
        JOptionPane.showInputDialog(null,"Ingrese el nombre del producto");
        JOptionPane.showInputDialog(null,"Ingrese el precio del producto");
        
        nombre =JOptionPane.showInputDialog(null,"Ingrese el nombre del producto");
        precio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio del producto"));
        
    }
    void EsCaro(){
        
        JOptionPane.showMessageDialog(null,"El producto es caro");

    }
    void EsBarato(){
    
        JOptionPane.showMessageDialog(null,"El producto es barato");
    }
}
