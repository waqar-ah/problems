package com.waqar.problems;

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 7, 9, 10, 12, 15, 16, 18, 20, 24, 28, 32, 35 };
        System.out.println(inifniteNumbers(nums, 16));
    }
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    static int inifniteNumbers(int[] nums, int target) {

        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return search(nums, start, end, target);
    }

    static int search(int[] nums, int start, int end, int target) {
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
