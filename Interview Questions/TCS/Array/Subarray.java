// TCS Technical Coding Interview Question (Array Topic)
// Question:
// You are given an array of integers. Your task is to find the longest contiguous subarray that has an equal number of 0s and 1s.

// Return the length of the longest subarray with equal 0s and 1s.

//Example 1:
//Input:
//arr = [0, 1, 0, 1, 1, 0, 1, 1]

// //Output:
// Longest Subarray Length: 6
// Explanation:
// The longest subarray with an equal number of 0s and 1s is [0, 1, 0, 1, 1, 0], which has length 6.
// Example 2:
// Input:
// arr = [1, 1, 1, 1, 0, 0, 1, 0]
// Output:

// Longest Subarray Length: 4
// Explanation:
// The longest subarray with equal 0s and 1s is [1, 0, 0, 1], which has length 4.

import java.util.*;

public class Subarray {
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // Initial sum 0 at index -1
        int maxLength = 0, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;  // Convert 0 to -1

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 1};  // Test case
        System.out.println("Longest Subarray Length: " + findMaxLength(arr));
    }
}
