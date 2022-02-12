package com.waqar.problems;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;

        int pivot = findPivot(nums);
        System.out.println(pivot);
        // if(pivot == -1){
        // System.out.println(searchTree(nums, target, 0, nums.length-1));
        // }
        // if(nums[pivot] == target ){
        // System.out.println(pivot);
        // }
        // if(target >= nums[0]){
        // System.out.println(searchTree(nums, target, 0, pivot-1));
        // }
        // System.out.println(searchTree(nums, target, pivot+1, nums.length-1));

    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;

    }

    static int findPivotWithDup(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (mid < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if (mid < end && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;

    }

    static int searchTree(int[] nums, int target, int start, int end) {
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
