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
public class InsertionSort {

    public static Integer[] Sort(Integer[] p_vector) {
        try {
            Integer[] vector = p_vector.clone();
            int currentNumber;
            int j;
            //10,20,15
            for (int i = 1; i < vector.length; i++) {
                currentNumber = vector[i]; //20
                //j = 0
                for (j = i-1 ; (j >=0) && vector[j] > currentNumber ; j--) {
                    vector[j+1] = vector[j];
                }
                vector[j+1] = currentNumber;
            }

            return vector;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
