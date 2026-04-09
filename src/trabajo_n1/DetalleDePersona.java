/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_n1;

/**
 *
 * @author Alumno
 */
public class DetalleDePersona {
    public static void main(String[] args) {
        
/*Se solicita crear una clase llamada DetallePersona que realice   lo siguiente:
Debe declarar las siguientes variables y deberás asignar los valores que correspondan, 
además de seleccionar el tipo de dato adecuado para cada variable.
>nombreCompleto
>edad
>altura (En metros)
>paisDeOrigen
>Indicar si es casado o soltero con sólo un caracter, ejemplo: 
‘C’ -> casado, ‘S’ -> soltero*/

    String NombreCompleto = "Nahuel Reinoso",PaisDeOrigen = "Argentina";
    char SolteroOCasado = 'C';
    double altura = 1.80;
    int edad = 18;
    
        System.out.println("Nombre Completo:"+NombreCompleto);
        System.out.println("Pais De Origen:"+PaisDeOrigen);
        System.out.println("Edad:"+edad);
        System.out.println("Altura:"+altura);
        System.out.println("Estado Civil:"+ SolteroOCasado);
        
       
    
    }
}
