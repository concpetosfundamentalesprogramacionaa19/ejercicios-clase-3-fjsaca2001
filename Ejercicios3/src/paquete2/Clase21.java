/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase21 {
    
    public static void main(String[] args) {
        
        boolean bandera;
        int valor1 = 1;
        int valor2 = 10;
        // comparacion con aperador logico
        bandera = valor1 < valor2;
        
        System.out.printf("Comparando dos valoeres :  %s\n", bandera);
        // coparacion logica con AND
        bandera = (valor1 < valor2) & (valor1 > valor2); 
        // Producto lógico – \AND (binario)
        
        System.out.printf("Comparacion utilizando el AND : %s\n", bandera);
        
        bandera = (valor1 < valor2) | (valor1 > valor2);
        
        System.out.printf("Comparacion utilizando el operador OR: %s\n", bandera);
        
        bandera = !((valor1 < valor2) | (valor1 > valor2)); 
         // Negación - NOT (unario)
        
        System.out.printf("Comparacion utilizando la NEGACION: %s\n", bandera);
    }
    
}
