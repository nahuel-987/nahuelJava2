/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseDeScanner;

import java.util.Scanner;

/**
 *
 * @author LABO B 9
 */
public class NewScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("ingrese su nombre");
        String nombre = input.nextLine();
       
        System.out.println("ingrese su edad");
        int edad = input.nextInt(); 
        
        System.out.println("ingrese su documento");
        int documento = input.nextInt(); 
        
        System.out.print("Ingresá una palabla   : ");
        char letra = input.next().charAt(1);
        System.out.println("tu vocal es:"+letra);
        
        System.out.println("tu edad es:" + edad);
        System.out.println("tu nombre es:"+nombre);
        System.out.println("su documento es:"+documento);
    }
}
