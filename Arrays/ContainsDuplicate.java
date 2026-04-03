/*
Problem: Contains Duplicate
Link: https://leetcode.com/problems/contains-duplicate/

Approach:
Use a HashSet to track elements.
If an element already exists in the set, return true.
Otherwise, add it to the set.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
