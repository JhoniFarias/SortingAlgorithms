/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Arrays;

/**
 *
 * @author Jhoni
 */
public class BubbleSort {

    
    public static Integer[] Sort(Integer[] p_vector){
        try {
            int aux; //varivel usada para armazenar o valor a ser trocado no array
            Integer[] vector = p_vector.clone();
            //para cada item do vetor rodamos o for novamente em busca de numeros desordenados
            for (int i = 0; i < vector.length; i++) {               
                //lenght - 1 no ultimo indice do array se for testar se o item anterio é maior que o ultimo lança exceção 
                //porque o array nao tem mais indices disponiveis                
                for (int j = 0; j < vector.length - 1; j++) { 
                    if (vector[j] > vector[j+1]) {
                        aux = vector[j];
                        vector[j] = vector[j+1];
                        vector[j+1] = aux;
                    }
                }
            }
            
            return vector;
                
        } catch (Exception e) {
            System.out.print(e.getMessage());
            throw e;
        }

    }
}
