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
public class QuickSort {
    
    public static Integer[] Sort(Integer[] p_Vector)
    {
        try {
            Integer[] vector = p_Vector.clone();
            QuickSort(vector, 0, vector.length - 1);
            
            return vector;

        } catch (Exception e) {
            System.out.print(e.getMessage());
            throw e;
        }
    }

    private static void QuickSort(Integer[] p_Vector, int p_start, int p_end) {
        try {
            
            if (p_start < p_end) {
                int pivot = GetPivot(p_Vector,p_start, p_end);
                QuickSort(p_Vector, p_start, pivot - 1);
                QuickSort(p_Vector, pivot+1, p_end);
            
           }

        } catch (Exception e) {
            System.out.print(e.getMessage());
            throw e;
        }

    }

    private static int GetPivot(Integer[] p_Vector, int p_start, int p_end) {
        try {

            int pivot = p_Vector[p_end];
            
            int smallNumber = p_start;
            int currentNumber;
            
            for (currentNumber = smallNumber; currentNumber < p_end; ++currentNumber) {
                
                if (p_Vector[currentNumber] <= pivot) {
                    
                    
                    int aux = p_Vector[currentNumber];
                    p_Vector[currentNumber] = p_Vector[smallNumber]; 
                    p_Vector[smallNumber] = aux;
                    smallNumber++;

                }
            }
            
            p_Vector[currentNumber] = p_Vector[smallNumber]; 
            p_Vector[smallNumber] = pivot;
            
            return smallNumber;
        } catch (Exception e) {
            System.out.print(e.getMessage());
            throw e;
        }
    }

}
