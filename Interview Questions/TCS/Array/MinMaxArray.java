// 1️⃣ Find the Largest and Smallest Element in an Array
// Problem:
// Given an array of N integers, find the smallest and largest elements.

// Example:
// Input:
// 5  
// 10 20 5 8 25  
// Output:
// Smallest: 5  
// Largest: 25  

import java.util.*;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
        sc.close();
    }
}

