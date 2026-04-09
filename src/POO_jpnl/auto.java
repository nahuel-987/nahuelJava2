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
public class auto {
    
    String modelo, marca;

    public auto(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
    
    
    void Arrancar(){
        
        
        marca = JOptionPane.showInputDialog( null ,"ingrese la marca del vehiculo");
       
        
        modelo = JOptionPane.showInputDialog(null,"ingrese el modelo del vehiculo");
        
        JOptionPane.showMessageDialog(null, "El vehiculo es un  "+ marca + " modelo: "+ modelo );
    
    }
}
