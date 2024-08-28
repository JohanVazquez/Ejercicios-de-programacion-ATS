/*Ejercicio 4: en megaplaza se hace un 20% de descuento a
los clientes cuya compra supere los $300 ¿cul sera la cantidad que
pagara una persona por su compra?*/
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        System.out.print("digite el subtotal de la compra\n->");
        double subtotal = jin.nextDouble();
        
        double total, descuento = 0;
        
        
        if (subtotal > 300) {
            total = subtotal * .80;
            descuento = subtotal * .20;
        }else{
            total = subtotal;
        }
        
        
        System.out.println("\ntotal: " + total + "\nahorrado: " + descuento);
        
    }
    
}
