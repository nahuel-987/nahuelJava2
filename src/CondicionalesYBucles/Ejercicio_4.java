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
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num1,num2,num3 ;
        
        System.out.println("Ingrese el primer numero:");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero:");
        num2 = input.nextInt();
        
        System.out.println("Ingrese el tercer numero:");
        num3 = input.nextInt();
        
        if(num2 > num1 && num2 > num3){
            System.out.println("El mayor es el segundo numero: "+ num2);
        }
        else if (num1 > num2 && num1 > num3){
            System.out.println("El mayor es el primer numero: "+ num1);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println("El mayor es el tercer numero: "+ num3);
        }
               
    }
}
