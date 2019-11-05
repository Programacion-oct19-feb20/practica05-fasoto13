/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase05;

/**
 *
 * @author reroes
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean valorA = true;
        boolean valorB = false;

        System.out.printf("Negacion: !%s = %s\n", valorA, !valorA);
        System.out.printf("Negacion: !%s = %s\n", valorB, !valorB);
        System.out.printf("And: %s & %s = %s\n", valorA, valorB, 
                valorA & valorB);
        System.out.printf("And: %s | %s = %s\n", valorA, valorB, 
                valorA | valorB); //V and V = Verdadero
                                  //V or V = verdadero(uno tiene que ser  V para
                                  //ser verdadero  
                                  
                                  
       
        
    }

}
