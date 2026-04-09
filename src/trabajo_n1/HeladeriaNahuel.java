package trabajo_n1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class HeladeriaNahuel {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String TipoDeSabor ;
        
        System.out.println("ingrese el TipoDeSabor ");
        TipoDeSabor = input.next();
        
        if (TipoDeSabor.equals("chocolate")||TipoDeSabor.equals("vainilla")||TipoDeSabor.equals("frutilla")||TipoDeSabor.equals("dulce de leche")){
            
            System.out.println("Si, hay "+ TipoDeSabor);
        }
        else{
            System.out.println("No hay "+ TipoDeSabor);
        }
               
        
    }
}
