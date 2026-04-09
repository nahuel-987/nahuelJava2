/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.util.Scanner;

/**
 *
 * @author LABO B 9
 */
public class Auto {
    String marca,modelo;
    double velocidad = 0;

    public Auto(String marca, String modelo, double velocidad) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    void acelerar(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Ingrese a la velocidad que quiere manejar que sea mayor a 0 y menos 250 ");
        velocidad = in.nextDouble();
        if (velocidad == 250){
            System.out.println("El auto acelero a una velocidad maxima de: " + velocidad +"Km");
        }
        else if (velocidad == 0){
            System.out.println("EL auto esta estatico:");
        }
        else if (velocidad >0){
            System.out.println("El auto aumento su velocidad a: " + velocidad);
        }
    }
    void frenar(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Ingrese a la velocidad que quiere manejar que sea mayor a 0 y menor a: "+velocidad);
        velocidad = in.nextDouble();
        System.out.println("EL auto freno la velocidad una velocidad de: " + velocidad);
    }
}
