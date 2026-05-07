/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mas_de_jpnl;

/**
 *
 * @author Alumno
 */
import javax.swing.JOptionPane;

class Calculadora {

    // Método para sumar
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar
    public double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public double dividir(double a, double b) {

        // Validación para evitar división por cero
        if (b == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: No se puede dividir por cero.");
            return 0;
        }

        return a / b;
    }
}

public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Solicitar números
        double num1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el primer número:"));

        double num2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el segundo número:"));

        // Menú de operaciones
        String operacion = JOptionPane.showInputDialog(
                "Seleccione una operación:\n"
                + "1 - Suma\n"
                + "2 - Resta\n"
                + "3 - Multiplicación\n"
                + "4 - División");

        double resultado = 0;

        // Estructura de control
        switch (operacion) {

            case "1":
                resultado = calc.sumar(num1, num2);
                JOptionPane.showMessageDialog(null,
                        "Resultado de la suma: " + resultado);
                break;

            case "2":
                resultado = calc.restar(num1, num2);
                JOptionPane.showMessageDialog(null,
                        "Resultado de la resta: " + resultado);
                break;

            case "3":
                resultado = calc.multiplicar(num1, num2);
                JOptionPane.showMessageDialog(null,
                        "Resultado de la multiplicación: " + resultado);
                break;

            case "4":
                resultado = calc.dividir(num1, num2);
                JOptionPane.showMessageDialog(null,
                        "Resultado de la división: " + resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null,
                        "Opción inválida.");
        }
    }
}