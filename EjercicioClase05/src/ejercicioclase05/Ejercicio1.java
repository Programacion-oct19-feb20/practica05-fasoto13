/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase05;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * Un padre de familia ha pagado tres cuotas de navidad de sus hijos la cuota
 * uno fue de 15 dolares, la cuota dos de 10 dolares, y la cuota tres de 16
 * dolares, generar uun programa en lenguaje Java que permita ingresar por 
 * teclado el calor de las cuotas, luego presentar el promedio de dolares 
 * de dolares pagados entre las cuotas, además presentar un mensaje en pantalla
 * "True or False" dependiendo del promedio, si el promedio es mayor o igual 11
 * debería salir True, si el promedio es menor a 11 deberia salir False
 */
public class Ejercicio1 {
public static void main(String[] args) {
        
Scanner entrada = new Scanner(System.in);

int cuota_1;
int cuota_2; 
int cuota_3;


System.out.println("Ingrese el valor de la primera cuota:");
cuota_1 = entrada.nextInt();

System.out.println("Ingrese el valor de la segunda cuota:");
cuota_2 = entrada.nextInt();

System.out.println("Ingrese el valor de la tercaera cuota:");
cuota_3 = entrada.nextInt();

int promedio = (cuota_1 + cuota_2 + cuota_3)/3;


System.out.printf("Cuotas de navidad:\nPrimera Cuota: %d\nSegunda Cuota:%d\n"
        + "Tercera Cuota: %d\nSuma: %d\n", cuota_1, cuota_2, cuota_3, cuota_1 +
                cuota_2 + cuota_3);

System.out.printf("El promedio total de las cuotas de navidad es: %d\n"
        + "Promedio: %s\n", promedio, promedio >=11);




    
    
    
    }
    
}
