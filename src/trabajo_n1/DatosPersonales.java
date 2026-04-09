/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_n1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class DatosPersonales {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;
        
        String nombreEmpleado;
        int edad;
        double salario;
        
        System.out.println("*** INGRRESE SUS DATOS ***");
        System.out.println("Nombre del Empleado:");
        nombreEmpleado = input.next();
        
        System.out.println("Edad del Empleado:");
        edad = input.nextInt();
        
        System.out.println("Salario del Empleado:");
        salario = input.nextDouble();
        
        System.out.println("*** DATOS DEL EMPLEADO ***");
        
        System.out.println("Nombre del Empleado:"+nombreEmpleado);
        
        System.out.println("Edad del Empleado:"+edad);
       
        System.out.println("Salario del Empleado:"+salario);
       
        
    }
}
