/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondicionalesYBucles;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int edad ;
        
        System.out.println("Ingrese su edad:");
        edad = input.nextInt();
        
        if(edad >= 18){
            System.out.println("Acceso permitido");
        }
        else {
            System.out.println("Acceso denegado");
        }
    }
}
