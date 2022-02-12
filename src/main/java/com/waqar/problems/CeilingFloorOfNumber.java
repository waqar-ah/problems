package com.waqar.problems;

public class CeilingFloorOfNumber {

    public static void main(String[] args) {

        int[] accendingArr = {2, 3, 5, 9, 14, 16, 18 };
        System.out.println(floorOfNumber(accendingArr, 10));

    }

    // Biggest number greater then equal to target number
    static int ceilOfNumber(int[] arr, int target) {

        var mid = 0;
        var start = 0;
        var end = arr.length - 1;
        if(target > arr[end]){
            return -1;
        }

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target ) {
                return arr[mid];
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }
        return start;
    }
    // Biggest number smaller then equal to target number
    static int floorOfNumber(int[] arr, int target) {

        var mid = 0;
        var start = 0;
        var end = arr.length - 1;
        if(target < arr[start]){
            return -1;
        }
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target ) {
                return arr[mid];
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }
        return end;
    }
}
