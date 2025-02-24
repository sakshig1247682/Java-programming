// TCS Placement Question – Array Rotation
// Problem Statement
// You are given an array arr[] of size N and an integer K. Your task is to rotate the array to the left by K positions.

// Example 1
// Input:
// arr = [1, 2, 3, 4, 5, 6, 7]
// K = 2
// Output:
// [3, 4, 5, 6, 7, 1, 2]
// Explanation:
// After rotating by 2 positions to the left, the first two elements move to the end.

// Explanation:
// After rotating by 2 positions to the left, the first two elements move to the end.

// Example 2
// Input:
// arr = [10, 20, 30, 40, 50]
// K = 3

// Output:

// [40, 50, 10, 20, 30]

import java.util.Arrays;

public class ArrayRotation {
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handling cases where k > n

        // Reverse the first part
        reverse(arr, 0, k - 1);
        // Reverse the second part
        reverse(arr, k, n - 1);
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int K = 2;
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        leftRotate(arr, K);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}

