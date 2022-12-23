/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayManagement;

/**
 *
 * @author ilhan
 */
public class Main {
    
    public static void main(String[] args) {

        InitAlgorithms init = new InitAlgorithms();
        int array_length = 1000000;
        
        System.out.println("Array uzunluğu : "+array_length);
        
        //init.initSelectionSort(array_length);
       //init.initInsertionSort(array_length);
        //init.initMergeSort(array_length);
        init.initHeapSort(array_length);
        //init.initQuickSortLomuto(array_length);
       // init.initQuickSortHoare(array_length);

       
    }
    
}
