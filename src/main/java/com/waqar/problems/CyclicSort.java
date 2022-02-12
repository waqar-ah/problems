package com.waqar.problems;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 2, 1, 4 };
        sorting(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sorting(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);

            } else {
                i++;
            }
        }

    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
