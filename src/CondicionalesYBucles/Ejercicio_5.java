/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondicionalesYBucles;

import java.util.Scanner;

/**
 *
 * @author LABO B 9
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
/*EJERCICIO 5 - Menú de opciones
Mostrar un menú:
1. Ver perfil
2. Editar datos
3. Cerrar sesión*/

        Scanner dato = new Scanner(System.in);
        int opc;
        String nombre = "Nahuel", apellido="Reinoso";
        int edad = 18;
        
        for (int i = 0; i < 1;){
            System.out.println("|____________________________|");
            System.out.println("|Menu:                       |");
            System.out.println("|Ver perfin 1                |");
            System.out.println("|Editar datos 2              |");
            System.out.println("|Cerrar sesion 3             |");
            System.out.println("|____________________________|");
        
            System.out.println("ingrese la opcion");
            opc = dato.nextInt();
       
        
            if ( opc == 1 ){
                System.out.println("Nombre:"+nombre);
                System.out.println("Apellido:"+apellido);
                System.out.println("Edad:"+edad);
            }
            else if (opc == 2){
                System.out.println("Edad");
                edad = dato.nextInt();
                System.out.println("Nombre:");
                nombre = dato.next();
                System.out.println("Apellido");
                apellido = dato.next();
            
            }
            else if(opc == 3){
                System.out.println("Cerrando Sesion...");
                i++;
                return ;
            }
        }
        
    }
}
