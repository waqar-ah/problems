package com.waqar.problems;

public class SplitArrayLargestSum {
    // https://leetcode.com/problems/split-array-largest-sum/
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int m = 2;
        int minValue = 0;
        int maxValue = 0;
        for (int i : nums) {
            minValue = Math.max(minValue, i);
            maxValue += i;
        }

       System.out.println(binarySearch(nums, minValue, maxValue, m));

    }

    static int binarySearch(int nums[], int start, int end, int m) {

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
