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
public class Ejercicio_11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num,res;
        
        
        System.out.println("Ingrese el numero:");
        num = input.nextInt();
        
        for(int i = 1; i < 11; ++i){
            res  = num * i;
            System.out.println(num +" X " + i + " = " + res);
        }
    }
}
