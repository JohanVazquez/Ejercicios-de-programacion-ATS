/*Ejercicio5: la calificacion final de un estudiante de informatica se calcula
con base a las calificaciones de cuatro aspectos de su rendimiento academico:
participacion, primer examen parcial, segundo examen parcial y examen final.
sabiendo que las calificaciones danteriores entran a la califacion final con
ponderaciones del 10, 25, 25 y 40 por ciento, hacer un programa que calcule
e imprima la calificacion final obtenida por un estudiante
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        float participacion, examen1, examen2, examen3, notafinal;
        
        System.out.print("digita la nota de partipacion\n->");
        participacion = jin.nextFloat();
        
        System.out.print("digita la nota del primer examen parcial\n->");
        examen1 = jin.nextFloat();
        
        System.out.print("digita la nota del segundo examen parcial\n->");
        examen2 = jin.nextFloat();
        
        System.out.print("digita la nota del examen final\n->");
        examen3 = jin.nextFloat();
        
        participacion *= 0.10f;
        examen1 *= 0.25f;
        examen2 *= 0.25f;
        examen3 *= 0.40f;                
        
        notafinal = participacion + examen1+ examen2 + examen3;
        
        System.out.println("nota final: " + notafinal);
        
        
    }
    
}
