/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import Business.BubbleSort;
import Business.InsertionSort;
import Business.QuickSort;
import Business.SelectionSort;
import Business.Utils;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhoni
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int vectorSize = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros aleatorios/desornados, para serem gerados "));
        Integer[] unorderedVector = Utils.GenerateUnorderedVector(vectorSize);
        
        new Thread() {

            @Override
            public void run() {
                
                long startTime = System.currentTimeMillis();
                Integer[] VectorBubbleSort = BubbleSort.Sort(unorderedVector);
                long EndTime = System.currentTimeMillis();  
                System.out.println("BubbleSort: " + (EndTime - startTime) + " ms");
            }
        }.start();

       new Thread() {
            @Override
            public void run() {
                
                long startTimeS = System.currentTimeMillis();
                Integer[] VectorSelectionSort = SelectionSort.Sort(unorderedVector);
                long EndTimeS = System.currentTimeMillis();
                System.out.println("SelectionSort: " + (EndTimeS - startTimeS) + " ms");
                
            }
        }.start();
        
        new Thread() {
            @Override
            public void run() {
                
                long startTimeI = System.currentTimeMillis();
                Integer[] VectorInsertionSort = InsertionSort.Sort(unorderedVector);
                long EndTimeI = System.currentTimeMillis();
                System.out.println("InsertionSort: "+(EndTimeI - startTimeI) + " ms");
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                
                long startTimeQ = System.currentTimeMillis();
                Integer[] VectorQuickSort = QuickSort.Sort(unorderedVector);
                long EndTimeQ = System.currentTimeMillis();
                System.out.println("QuickSort: " + (EndTimeQ - startTimeQ) + " ms");
                
            }
        }.start();

    }

}
