
/*
 * Date: Sep 14, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: 6
 */

import java.util.Arrays;

public class Comparable_Example {

    // Bubble sort using Comparable
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
           // System.out.println("Testing " + arr[i]);
            
            for (int j = 0; j < arr.length - i - 1; j++) {
                
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 3, 8, 1, 4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

        String[] words = {"zebra", "apple", "monkey"};
        bubbleSort(words);
        System.out.println(Arrays.toString(words));
    }
}