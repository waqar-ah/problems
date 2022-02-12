package com.waqar.problems;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        System.out.println(mountain(arr));
    }
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/
    static int mountain(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            } 

        }

        return start;

    }
}
