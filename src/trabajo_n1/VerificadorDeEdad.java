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
public class VerificadorDeEdad {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int edad ;
        
        System.out.println("Ingrese su edad:");
        edad = input.nextInt();
        
        if(edad >= 16){
            System.out.println("Tienes permitido conducir");
        }
        else {
            System.out.println("No tienes permitido conducir");
        }
    }
}
