// TCS Technical Coding Interview Question (Array - Leader Elements in an Array)
// Question:
// An element is called a leader if it is greater than all the elements to its right in the array.
// You need to find all leader elements in the given array and return them in the order they appear.


// Example 1:
// Input:
// nums = [16, 17, 4, 3, 5, 2]

// Output:
// [17, 5, 2]

// Explanation:

// 2 is a leader as there are no elements to its right.
// 5 is greater than 2, so it is a leader.
// 17 is greater than all elements to its right, so it is a leader.

// Example 2:
// Input:
// nums = [1, 2, 3, 4, 5]

// Output:
// [5]

// Explanation: 5 is the only leader since all elements before it are smaller.


import java.util.*;

class Solution {
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                leaders.add(nums[i]);
                maxFromRight = nums[i];
            }
        }

        // Reverse the list to maintain the original order
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        System.out.println(findLeaders(nums));  // Output: [17, 5, 2]
    }
}
