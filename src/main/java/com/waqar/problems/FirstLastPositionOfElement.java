package com.waqar.problems;

public class FirstLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        for (int i : searchRange(nums, 10)) {
            System.out.println(i);

        }
    }

    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] nums, int target, boolean findStart) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
