package com.waqar.problems;

public class BinarySearchTree {
    public static void main(String[] args) {

        int[] accendingArr = { -18, -5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] decendingArr = { 90, 75, 18, 10, 8, 5, 4, 1, 0 };
        System.out.println(binarySearch(accendingArr, -5));

    }

    static int binarySearch(int[] arr, int target) {

        var mid = 0;
        var start = 0;
        var end = arr.length - 1;
        boolean isAccending = arr[start] < arr[end];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAccending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

}
