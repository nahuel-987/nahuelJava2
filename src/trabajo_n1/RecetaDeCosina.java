/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_n1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class RecetaDeCosina {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String NombreDeLaReceta,Ingredientes,Dificultad;
        double tiempo;
        
        System.out.println("Ingrese el nombre de la receta ");
        NombreDeLaReceta = input.next();
        
        System.out.println("Ingrese los ingredientes");
        Ingredientes = input.next();
        
        System.out.println("Ingrese el tiempo a cosinar");
        tiempo = input.nextDouble();
        
        System.out.println("Ingrese la Dificultad de preparacion");
        Dificultad = input.next();
        
        System.out.println("El nombre de la receta es:"+NombreDeLaReceta);
        

    }
}
