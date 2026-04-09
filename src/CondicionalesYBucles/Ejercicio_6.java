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
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        float num1,num2;
        String opc;
        System.out.println("Ingrese Dos numeros");
        System.out.println("  ");
        
        System.out.println("ingrese el primer numero");
        num1 = input.nextFloat();
        System.out.println("  ");
        
        System.out.println("ingrese el segundo numero");
        num2 = input.nextFloat();
        System.out.println("  ");
        
        System.out.println("ingrese (+) para sumar");
        System.out.println("ingrese (-) para restar");
        System.out.println("ingrese (*) para multiplicar");
        System.out.println("ingrese (/) para dividir");
        
        System.out.println("  ");
        opc = input.next();
        
        switch (opc){
            case "+":
                System.out.println("  ");
                System.out.println(num1 + num2);
            break;
            case "-":
                System.out.println("  ");
                System.out.println(num1 - num2);
            break;
            case "*":
                System.out.println("  ");
                System.out.println(num1 * num2);
            break;
            case "/":
                System.out.println("  ");
                System.out.println(num1 / num2);
            break;
        }
               
    }
}
