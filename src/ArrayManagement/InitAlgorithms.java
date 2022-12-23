/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayManagement;

import Algorithms.HeapSort;
import Algorithms.InsertionSort;
import Algorithms.SelectionSort;
import Algorithms.MergeSort;
import Algorithms.QuickSortLomuto;
import Algorithms.QuickSortHoare;
import java.util.Random;
import javax.management.Query;

/**
 *
 * @author ilhan
 */
public class InitAlgorithms {

    public void initArrays(ArrayManagement arr){
        arr.fill_random();
        arr.make_sorted();
        arr.make_r_sorted();
    }
    
    
    
    public void initSelectionSort(int length) {

        ArrayManagement ar1 = new ArrayManagement(length);
        SelectionSort ss = new SelectionSort();
        initArrays(ar1);
        
        System.out.println("----SELECTION SORT----");
        
        long start = System.nanoTime();
        ss.sort(ar1.random_numbers);
        long end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Random Array)");
        
        start = System.nanoTime();
        ss.sort(ar1.sorted_numbers);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Sorted Array)");
        
        start = System.nanoTime();
        ss.sort(ar1.r_sorted_numbers);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Reverse Sorted Array)");

    }

    public void initInsertionSort(int length) {

        ArrayManagement ar2 = new ArrayManagement(length);
        InsertionSort is = new InsertionSort();
        initArrays(ar2);
       
        System.out.println("----INSERTION SORT----");
        long start = System.nanoTime();
        is.sort(ar2.random_numbers);
        long end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Random Array)");
        
        start = System.nanoTime();
        is.sort(ar2.sorted_numbers);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Sorted Array)");
        
        start = System.nanoTime();
        is.sort(ar2.r_sorted_numbers);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Reverse Sorted Array)");

        
    }

    public void initHeapSort(int length) {
        ArrayManagement ar4 = new ArrayManagement(length);
        HeapSort hs = new HeapSort();
        initArrays(ar4);
        System.out.println("----HEAP SORT----");
        
        long start = System.nanoTime();
        hs.sort(ar4.random_numbers);
        long end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Random Array)");
        
        start = System.nanoTime();
        hs.sort(ar4.sorted_numbers);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Sorted Array)");
        
        start = System.nanoTime();
        hs.sort(ar4.r_sorted_numbers);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Reverse Sorted Array)");

        
    }

    public void initMergeSort(int length) {
        ArrayManagement ar3 = new ArrayManagement(length);
        MergeSort ms = new MergeSort();
        initArrays(ar3);
        
        
        System.out.println("----MERGE SORT----");
        
        long start = System.nanoTime();
        ms.sort(ar3.random_numbers, ar3.random_numbers[0], ar3.random_numbers[length - 1]);
        long end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Random Array)");
        
        start = System.nanoTime();
        ms.sort(ar3.sorted_numbers, ar3.sorted_numbers[0], ar3.sorted_numbers[length - 1]);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Sorted Array)");
        
        start = System.nanoTime();
        ms.sort(ar3.r_sorted_numbers, ar3.r_sorted_numbers[0], ar3.r_sorted_numbers[length - 1]);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Reverse Sorted Array)");

      
    }
    

    public void initQuickSortLomuto(int length) {

        ArrayManagement ar5 = new ArrayManagement(length);
        QuickSortLomuto qsl = new QuickSortLomuto();
        initArrays(ar5);
        
        System.out.println("----QUICK SORT LOMUTO----");

        long start = System.nanoTime();
        qsl.quickSortLomuto(ar5.random_numbers, ar5.random_numbers[0], ar5.random_numbers[length - 1]);
        long end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Random Array)");

        start = System.nanoTime();
        qsl.quickSortLomuto(ar5.sorted_numbers, ar5.sorted_numbers[0], ar5.sorted_numbers[length - 1]);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Sorted Array)");

        start = System.nanoTime();
        qsl.quickSortLomuto(ar5.r_sorted_numbers, ar5.r_sorted_numbers[0], ar5.r_sorted_numbers[length - 1]);
        end = System.nanoTime();
        System.out.println(end - start + " nano saniye (Reverse Sorted array)");

        
    }

    public void initQuickSortHoare(int length) {

        ArrayManagement ar6 = new ArrayManagement(length);
        QuickSortHoare qsh = new QuickSortHoare();
        initArrays(ar6);

        System.out.println("----QUICK SORT HOARE----");
        
        long start = System.nanoTime();
        qsh.quickSortHoare(ar6.random_numbers, ar6.random_numbers[0], ar6.random_numbers[length - 1]);
        long end = System.nanoTime();
        System.out.println(end - start  + " nano saniye (Random Array)");

        long start2 = System.nanoTime();
        qsh.quickSortHoare(ar6.sorted_numbers, ar6.sorted_numbers[0], ar6.sorted_numbers[length - 1]);
        long end2 = System.nanoTime();
        System.out.println(end - start + " nano saniye (Sorted Array)");

        long start3 = System.nanoTime();
        qsh.quickSortHoare(ar6.r_sorted_numbers, ar6.r_sorted_numbers[0], ar6.r_sorted_numbers[length - 1]);
        long end3 = System.nanoTime();
        System.out.println(end - start + " nano saniye (Reverse Sorted Array)");

        /*ar6.print(ar6.make_r_sorted(ar6.random_numbers));
        ar6.print(ar6.make_r_sorted(ar6.sorted_numbers));
        ar6.print(ar6.make_r_sorted(ar6.r_sorted_numbers));*/
    }

    

}
