// TCS Technical Coding Interview Question (Array Topic)
// Problem Statement:
// You are given an array of integers nums of size N. Your task is to find the second largest element in the array. If there is no second largest element, return -1.

// Example 1:
// Input:
// nums = [12, 35, 1, 10, 34, 1]
// Output
// 34

// Example 2:
// Input:

// nums = [10, 10, 10]
// Output
// -1
// Explanation:

// All elements are the same, so there is no second largest element.

import java.util.*;

public class SecondLargestElement {
    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) return -1;

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        System.out.println(findSecondLargest(nums)); // Output: 34
    }
}

