/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_n1;

/**
 *
 * @author Alumno
 */
public class GenerarEmail {
    public static void main(String[] args) {
        
/*Se solicita crear una clase llamada GenerarEmail para generar un email a partir de los siguientes datos:
>nombreCompleto -> Lionel Andres Messi
>Empresa -> Cen Tech
>Dominio -> CEN.TECH.COM.AR*/

    String nombreCompleto = "Lionel Andres Messi",Empresa = "Cen Tech", Dominio = "CEN.TECH.COM.AR";
    
        System.out.println("*** GENERADOR DE EMAIL ***");
        System.out.println("Nombre Usuario:"+nombreCompleto);
        System.out.println("Nombre Empresa:"+Empresa);
        System.out.println("Nombre Dominio:"+Dominio);
        System.out.println(" ");
        System.out.println("Creando Email........");
        System.out.println(" ");
        System.out.println(nombreCompleto+"@"+Dominio);
    
    }
}
