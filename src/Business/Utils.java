/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Jhoni
 */
public class Utils {

    public static Integer[] GenerateUnorderedVector(int p_size) {
        try {
            
            ArrayList<Integer> listNumbers = new ArrayList<>(); 
            
            for (int i = 0; i < p_size; i++) {
                listNumbers.add(i);
            }
            Collections.shuffle(listNumbers);
            Integer[] vector = new Integer[listNumbers.size()];
            listNumbers.toArray(vector);
             
            return vector;

        } catch (Exception e) {
            System.out.print(e.getMessage());
            throw e;
        }
    }

    private static boolean HasNumber(int p_Number, int[] p_vector) {
        try {
            for (int i = 0; i < p_vector.length; i++) {
                if (p_vector[i] == p_Number)
                    return true;
            }
            return false;
        } catch (Exception e) {
            System.out.print(e.getMessage());
            throw e;
        }

    }

}
