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
public class Ejercicio_2 {
        public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int numero ;
        
        System.out.println("Ingrese un numero:");
        numero = input.nextInt();
        
        if(numero == 0){
            System.out.println("Numero neutro");
        }
        else if (numero > 0 ){
            System.out.println("Numero positivo");
        }
        else{
            System.out.println("Numero Negativo");
        }
    }
}
