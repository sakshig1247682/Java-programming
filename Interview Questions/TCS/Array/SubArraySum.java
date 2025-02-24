// Question: Subarray with Given Sum
// Given an array of N non-negative integers and an integer S, find a contiguous subarray that adds up to S. Return the starting and ending indices (1-based) of the subarray. If no such subarray exists, return -1.

// Example 1:

// Input:
// N = 5, S = 12  
// arr = [1, 2, 3, 7, 5]  

// Output:
// 2 4  
// Explanation: The subarray [2, 3, 7] adds up to 12.

// Example 2:

// Input:
// N = 10, S = 15  
// arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  

// Output:
// 1 5  

// Explanation: The subarray [1, 2, 3, 4, 5] adds up to 15.

import java.util.*;

public class SubArraySum {
    public static void findSubarraySum(int[] arr, int N, int S) {
        int start = 0, sum = 0;
        for (int end = 0; end < N; end++) {
            sum += arr[end]; 
            
            while (sum > S && start <= end) {
                sum -= arr[start]; 
                start++; 
            }

            if (sum == S) {
                System.out.println((start + 1) + " " + (end + 1));
                return;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int S = 12;
        findSubarraySum(arr, arr.length, S);
    }
}


