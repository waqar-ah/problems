package com.waqar.problems;

import java.util.HashMap;

/**
 * @author Waqar Ahmad
 *
 *         Oct 15, 2021
 */

public class TwoSums {

	public static void main(String[] args) {
		int[] asd = { 1, 4, 45, 6, 10, 8 };
		int[] result = twoSum2(asd, 16); //twoSum(asd, 16);
		for (int i : result) {
			System.out.println(i);

		}
		

	}

	public static int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];
		int start = 0;
		int size = nums.length-1;
		for (int i = 1; i <= size; i++) {
				int sum = nums[start] + nums[i];
				if (sum == target) {
					result[0] = start;
					result[1] = i;
					return result;
				}
			if (i == size) {
				start++;
				i =start;
			}
		}
		return null;

	}
	public static int[] twoSum2(int[] nums, int sum) {
		int[] result = new int[2];

		 HashMap<String,Integer> s = new HashMap<String,Integer>();
	     for (int i = 0; i < nums.length; ++i)
	     {
	         Integer temp = sum - nums[i];

	         if (s.containsKey(temp.toString())) {
	             System.out.println(
	                 "Pair with given sum "
	                 + sum + " is (" + nums[i]
	                 + ", " + temp + ")");
	             	 result[0] = i;
		             s.forEach((key, value) -> {
		            	 if(key.equalsIgnoreCase(temp.toString())) {
		 					result[1] = value;
		            	 }
		            	 
		             });
					return result;
	         }
	         s.put(Integer.toString(nums[i]), i);
	     }
		return null;

	}


}
