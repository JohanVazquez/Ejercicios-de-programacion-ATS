/*Ejercicio 8: construir un programa que calcule y muestre por pantalla
las raices de la ecuacion de segundo grado de coeficientes reales*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        
        System.out.println("Ingrese el coeficiente a:");
        double a = jin.nextDouble();

        System.out.println("Ingrese el coeficiente b:");
        double b = jin.nextDouble();

        System.out.println("Ingrese el coeficiente c:");
        double c = jin.nextDouble();

        double discriminante = b * b - 4 * a * c;
        System.out.println("el discriminante es" + discriminante);
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        
    }
} 
    
