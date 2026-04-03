/*
Problem: Maximum Subarray
Link: https://leetcode.com/problems/maximum-subarray/

Approach:
Use Kadane’s Algorithm.
At each step, decide whether to continue the current subarray or start a new one.
Track the maximum sum found so far.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start new
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update max sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
