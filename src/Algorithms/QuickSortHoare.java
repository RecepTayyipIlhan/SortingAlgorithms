/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author ilhan
 */
        
public class QuickSortHoare {

    public int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
 
        while (true) {
           
            do {
                i++;
            } while (arr[i] < pivot);
 
            do {
                j--;
            } while (arr[j] > pivot);
 
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
 
    
    public void quickSortHoare(int[] arr, int low, int high)
    {
        if (low < high) {
            
            int pi = partition(arr, low, high);
 
            quickSortHoare(arr, low, pi);
            quickSortHoare(arr, pi + 1, high);
        }
    }
 
}
