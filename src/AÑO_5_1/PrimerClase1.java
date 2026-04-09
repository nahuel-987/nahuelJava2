/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AÑO_5_1;

import java.util.Scanner;

/**
 *
 * @author LABO B 9
 */
public class PrimerClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String nombre ="nahuel" , localidad="nonogasta" ;
        String nombre, localidad;
        int edad;
        
        System.out.println("ingrese su nombre");
        nombre= input.nextLine();
        System.out.println("ingrese su localidad");
        localidad = input.nextLine();
        System.out.println("ingrese su edad");
        edad= Integer.parseInt(input.nextLine());
        System.out.println("hola soy "+ nombre + " tengo " + edad + " anios y vivo en " + localidad );
        
    }
    
}
