package com.waqar.problems;

public class FindInMountainArray implements MountainArray {
    static int[] arr = { 1, 2, 3, 4, 5, 3, 1 };

    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/find-in-mountain-array/
    /**
     * 1. Binary Search 2. find peak then search in bot sides
     * 
     */

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakElement(mountainArr);
        int first = binarySearch(mountainArr, target, 0, peak);
        if (first != -1) {
            return first;
        }

        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    int peakElement(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    int binarySearch(MountainArray mountainArr, int target, int start, int end) {
        int mid = 0;
        boolean isAccending = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == mountainArr.get(mid)) {
                return mid;
            }
            if (isAccending) {
                if (target > mountainArr.get(mid)) {
                    start = mid + 1;
                } else if (target < mountainArr.get(mid)) {
                    end = mid - 1;
                }
            } else {
                if (target < mountainArr.get(mid)) {
                    start = mid + 1;
                } else if (target > mountainArr.get(mid)) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

    @Override
    public int get(int index) {

        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

interface MountainArray {
    public int get(int index);

    public int length();
}