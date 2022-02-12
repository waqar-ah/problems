package com.waqar.problems;

public class RecursiveBinarySearch {
    private static int binarySearch;

    public static void main(String[] args) {
        int[] arr = { -18, -5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        binarySearch = binarySearch2(arr, 0, arr.length - 1, 0, 8);
        System.out.println(binarySearch);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        var mid = 0;

        int end = arr.length - 1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearch2(int[] arr, int start, int end, int mid, int target) {
        if (start > end) {

            return -1;
        }
        mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            return binarySearch2(arr, mid + 1, end, mid, target);
        } else {
            return binarySearch2(arr, start, mid - 1, mid, target);
        }
    }
}
