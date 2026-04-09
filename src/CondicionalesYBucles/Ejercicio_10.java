/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondicionalesYBucles;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        LocalDate fecha  = LocalDate.now();
        
        int opc ;
              
        for (int i = 0; i < 1; ){
            System.out.println("***   MENU   ***");
            System.out.println("1). Saludar ");
            System.out.println("2). Mostrar Fecha");
            System.out.println("3). Salir");
            
            opc = input.nextInt();
            
            
            if (opc == 1 ){
                System.out.println(" Hola ");
            }
            else if (opc == 2){
                System.out.println("Fecha:" + fecha);
            }
            else if (opc == 3){
                System.out.println("Saliendo....");
                
                return ;
            }
        }
        
       
               
    }
}
