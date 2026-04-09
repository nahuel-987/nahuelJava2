/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author LABO B 9
 */
public class Perro {
    String nombre,raza;

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    void ladrar(){
        System.out.println("Hola soy "+ nombre +" soy un "+raza+" Guau! Guau!");
        
    }
    
}
