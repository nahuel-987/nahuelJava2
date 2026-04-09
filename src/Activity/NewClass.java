/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity;

import java.util.Scanner;

/**
 *
 * @author LABO B 9
 */
public class NewClass {
    public static void main(String[] args) {
/*Se solicita crear una clase llamada DetallePersona que realice   lo siguiente:
Debe declarar las siguientes variables y deberás asignar los valores que correspondan, además de seleccionar el tipo de dato adecuado para cada variable.
>nombreCompleto
>edad
>altura (En metros)
>paisDeOrigen
>Indicar si es casado o soltero con sólo un caracter, ejemplo: 
‘C’ -> casado, ‘S’ -> soltero*/

    Scanner input = new Scanner(System.in);
        String nombreCompleto;
        System.out.println("Ingrese su nombre");
        nombreCompleto= input.nextLine();
        int edad;
        System.out.println("Ingrese su edad");
        edad= input.nextInt();
        double altura;
        System.out.println("Ingrese su altura");
        altura=input.nextDouble();
        String paisDeOrigen;
        System.out.println("Ingrese su pais de origen");
      
        char opcion;
        System.out.println("ingrese (C) si esta casado");
        System.out.println("ingrese (S) si esta soltero");
        opcion = input.next().charAt(0);        

            
        if(opcion == 'C'){
            System.out.println("estoy cansado");
        }
        else if(opcion == 'S'){
            System.out.println("estoy soltero");
        }

}
  
}
