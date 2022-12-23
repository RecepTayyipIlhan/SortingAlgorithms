/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayManagement;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author ilhan
 */
public class ArrayManagement {

    public int[] random_numbers;
    public int[] sorted_numbers;
    public int[] r_sorted_numbers;

    public ArrayManagement(int len) {
        random_numbers = new int[len];
        sorted_numbers = new int[len];
        r_sorted_numbers =new int[len];
    }

    public void fill_random() {
        Random rnd = new Random();
        for (int i = 0; i < random_numbers.length; i++) {
            random_numbers[i] = rnd.nextInt(99);
        }
    }

    public void make_sorted(){
        sorted_numbers = random_numbers;
        Arrays.sort(sorted_numbers);
    }

    
    public void make_r_sorted() {
        r_sorted_numbers = sorted_numbers;
        
        if(r_sorted_numbers[0] < r_sorted_numbers[1]){
            for (int i = 0; i < r_sorted_numbers.length / 2; i++) {
                int temp = r_sorted_numbers[i];
                r_sorted_numbers[i] = r_sorted_numbers[r_sorted_numbers.length - i - 1];
                r_sorted_numbers[r_sorted_numbers.length - i - 1] = temp;
            }
            
        }
            
    }
    
    public int[] make_r_sorted(int[] arr) {
        
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------------------------------");

    }

}
