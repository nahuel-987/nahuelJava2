/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author LABO B 9
 */
public class Zapatilla {
     String Marca,Talle,Color,Mercado;

    public Zapatilla(String Marca, String Talle, String Color, String Mercado) {
        this.Marca = Marca;
        this.Talle = Talle;
        this.Color = Color;
        this.Mercado = Mercado;
    }
    
    void Mensaje(){
        System.out.println("Hola me compre una zapatilla Marca "+ Marca +" de talle "+Talle+ " y de color "+ Color + "en el local " +Mercado);
        
    }
}
