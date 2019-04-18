/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;
import paquetedatos.Variable;
import paquetedatos.VariableDatos;
/**
 *
 * @author DELL
 */
public class Principal {
    
    public static void main(String[] args){
        // Metodo principal
        double resultado;
        resultado = Variable.numero1 + VariableDatos.numero3;
        System.out.printf("El resultado es: %.1f", resultado);
    }
}
