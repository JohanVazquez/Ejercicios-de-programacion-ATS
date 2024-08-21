/*una compañia de venta de carros usados, paga a su personal
de ventas un salario de 1000 mensuales, mas una comision de 150 por
cada carro vendido, mas el 5% del valor de la venta por carro, cada mes
el capturista de la empresa ingresa en la computadora los datos pertinentes.
hacer un programa que calcule e imprima el salario mensual de un vendedor dado
*/
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner jin = new Scanner (System.in);
        
        float total, salario_fijo = 1000, porcentaje, comision1, comision2 = 0, comision3 = 0;
        int vendidos, auxiliar = 0, auxiliar2 = 1;
        
        System.out.print("cuantos carros vendiste?\n->");
        vendidos = jin.nextInt();
        
        comision1 = 150 * vendidos;
        
        while(auxiliar < vendidos){
            System.out.print("cual fue el costo total de la compra del carro " + auxiliar2 + "\n");
            porcentaje = jin.nextFloat();
            
            comision2 = (float) (porcentaje * .05);
            
            
            comision3 = comision2 + comision3;
            auxiliar++;
            auxiliar2++;
        }
        
        total = salario_fijo + comision2 + comision3;
        
        System.out.println("NOMINA DE PAGO\n"
                + "\nsueldo mensual: "+salario_fijo
                + "\ncarros vendidos: "+vendidos
                + "\ncomision por carros vendidos: " + comision1
                + "\ncomision de la venta: " + comision3
                + "\ntotal: " + total);
        
               
    }
    
}
