/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondicionalesYBucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        
        Random numA = new Random();
        Scanner  input = new Scanner (System.in);
        
        int num ;
        
        System.out.println("Ingrese un numero del 1 al 10:");
        num = input.nextInt();
        
        int numAlatorio ;
        
        numAlatorio = numA.nextInt(10)+1;
        
        for (int i = 0; i<1;){
            if (num == numAlatorio){
                System.out.println("Felicidades");
                i++;
            }
            else {
                System.out.println("Intenta nuevamente");
                System.out.println("  ");
                System.out.println("Ingrese un numero del 1 al 10:");
                num = input.nextInt();
            }
        }
    }
}
