/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author LABO B 9
 */
public class mianEstudiante {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Nahuel", 18);
        Estudiante e2 = new Estudiante("Pamela", 16);

        e1.estudiar();
        e2.rendir();
        e2.edad();
    }
}
