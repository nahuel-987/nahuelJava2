/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.util.Scanner;

/**
 *
 * @author LABO B 9
 */
public class MainAuto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc ;
        Auto a1 = new Auto("ford", "Raptor", 100);
        
        
        
        for(int i = 0; i<1;){
            
        System.out.println("   ");
        System.out.println("Indique que quiere hacer");
        System.out.println("  "); 
        System.out.println("1.para disminuir");
        System.out.println("2.para aclerar");
        System.out.println("3.para finalizar la simulacon");
        System.out.println("   ");
            
        opc = input.nextInt();
            
            if (opc == 2){
                a1.acelerar();            
            }
            else if(opc == 1){
                a1.frenar();
            }
            else if (opc == 3){
                i++;
                return;
            }
        }
        
        
    }
 
}
