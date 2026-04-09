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
public class Ejercicio_9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int i;
     
        System.out.println("ingrese un numero:");
        i = input.nextInt();
                
        while(i >= 0){
            System.out.println("NUMERO INVALIDO");
            System.out.println("   ");
            System.out.println("ingrese un numero:");
            i = input.nextInt();
        }
        
    }
}
