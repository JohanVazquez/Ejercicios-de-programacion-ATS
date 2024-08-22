/*Ejercicio 6:
Hacer un programa que calcule el cuadrado de una suma
(a+b)2 = a2 + b2 + 2ab*/

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        //Variables
        double a, b, resultado;
        
        //Capturo datos        
        System.out.print("Digite el valor de a\n->");
        a = jin.nextDouble();
        System.out.print("Digite el valor de b\n->");
        b = jin.nextDouble();
        
        //Calculo el resultado
        
        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        
        //Imprimo el valor
        System.out.println("El resultado del cuadrado de la suma es: "+ resultado);
    } 
}
