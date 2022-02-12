package com.waqar.problems;

public class MissingNumberInArray {
    // https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {

        int[] nums = { 3, 0, 1 };
        System.out.println(missingNumber2(nums));

    }

    public static int missingNumber(int[] nums) {
        int notExist = -1;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    System.out.println("Exist: " + nums[j]);
                    notExist = -1;
                    break;
                } else {
                    notExist = i;
                }
            }
            if (notExist >= 0) {
                return notExist;
            }
        }

        return -1;

    }

    public static int missingNumber2(int[] nums) {
        int sum = 0;

        int n = nums.length;

        int acualSum = n * (n + 1) / 2;

        for (int j = 0; j < nums.length; j++) {
            sum = sum + nums[j];
        }

        return acualSum - sum;

    }

    public static int missingNumber3(int[] nums) {
        int sum = 0;

        int n = nums.length;

        int acualSum =0;
        for (int j = 0; j <= n; j++) {
            acualSum = acualSum + j;
        }
        for (int j = 0; j < nums.length; j++) {
            sum = sum + nums[j];
        }

        return acualSum - sum;

    }
    public static int missingNumber4(int[] nums) {

        int acualSum =nums.length;
        for (int i = 0; i <  nums.length; i++) {
            acualSum = acualSum + (i-nums[i]);
        }

        return acualSum;

    }
}
