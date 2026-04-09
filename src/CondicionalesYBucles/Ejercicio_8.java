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
public class Ejercicio_8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String contraseña;
        String contra;
        String NombreDeUsuario;
        
        System.out.println("*** REGISTRARSE ***");
        System.out.println("Nombre De Usuario: ");
        NombreDeUsuario = input.next();
        System.out.println("Contrasena:");
        contraseña = input.next();
        System.out.println("  ");
        System.out.println("SE RESGISTRO CORRECTAMENTE...");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("*** INICIO DE SESION ***");
        System.out.println("Ingrese su contrasena:");
        contra = input.next();
        
        for(int i = 0; i<1;){
            if (contra.equals(contraseña)){
                System.out.println("   ");
                System.out.println("BIENVENIDO");
                System.out.println("   ");
                System.out.println(" ________________");
                System.out.println("| ****      **** |");
                System.out.println("| *||*      *||* |");
                System.out.println("| ****      **** |");
                System.out.println("|                |");
                System.out.println("|   **      **   |");
                System.out.println("|    **    **    |");
                System.out.println("|     ******     |");
                System.out.println("|      ****      |");
                System.out.println("|________________|");
                
                i++;
            }
            else if (!contra.equals(contraseña)){
                System.out.println("   ");
                System.out.println("CONTRASENA INCORRECTA");
                System.out.println("   ");
                System.out.println("Ingrese su contrasena:");
                contra = input.next();
                
            }
        }
        
        
        
        
        
    }
}
