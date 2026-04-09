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
public class Ejercicio_3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int nota ;
        
        System.out.println("Ingrese su nota:");
        nota = input.nextInt();
        
        if(nota > 9 && nota == 10){
            System.out.println("Excelente");
        }
        else if (nota > 7 && nota <= 8){
            System.out.println("Aprobado/a");
        }
        else if (nota > 4 && nota <= 6){
            System.out.println("Recupera");
        }
        else if (nota >= 0 && nota <= 3){
            System.out.println("Desaprobado/a");
        }
        
    }
}
