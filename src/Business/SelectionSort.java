/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Jhoni
 */
public class SelectionSort {
    
    public static Integer[] Sort(Integer[] p_vector){
         try {
            
             Integer[] vector = p_vector.clone();
             
             for (int i = 0; i < vector.length; i++) {
                 int positionSmallNumber = i; //primeira posicao o menor numero
                 
                 //ignoro a primeira posição do array começo pela segunda posição
                 for (int j = positionSmallNumber + 1 ; j < vector.length; j++) {
                     
                     if (vector[positionSmallNumber] > vector[j]) { // 2 é maior que 1
                         positionSmallNumber = j; //posicao 2
                     }
                 }
                 //se o indice atual for menor que o indice do menor numero
                 if (i < positionSmallNumber) {
                     int aux = vector[i]; //armazeno o valor do indice atual
                     
                     vector[i] = vector[positionSmallNumber]; // troco o indice atual pelo menor numero
                     vector[positionSmallNumber] = aux; // e onde estava o menor numero substituo pelo maior     
                 }
             }
            
            
            return vector;
                
        } catch (Exception e) {
            System.out.print(e.getMessage());
            throw e;
        }
    }
}
