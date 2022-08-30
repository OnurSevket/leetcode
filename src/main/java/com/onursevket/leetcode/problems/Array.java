package com.onursevket.leetcode.problems;

public class Array {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; nums.length > i; i++) {
            for (int j = i + 1; nums.length > j; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

}
