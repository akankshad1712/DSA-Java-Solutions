/*
Problem: Product of Array Except Self
Link: https://leetcode.com/problems/product-of-array-except-self/

Approach:
We calculate prefix and suffix products without using division.

1. First pass: store prefix product (product of all elements to the left)
2. Second pass: multiply with suffix product (product of all elements to the right)

Time Complexity: O(n)
Space Complexity: O(1) (excluding output array)
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Fill prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
