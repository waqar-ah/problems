package com.waqar.problems;

public class EvenNumberOfDigits {
	public static void main(String[] args) {
		int[] asd = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbersBest(asd));
	}

	public static int findNumbers(int[] nums) {
		int evenNumbers = 0;
		for (int i = 0; i < nums.length; i++) {
			String asd = "" + nums[i];
			char[] ch = asd.toCharArray();
			int result = ch.length % 2;
			if (result == 0) {
				evenNumbers++;
			}
		}
		return evenNumbers;
	}

	public static int findNumbers2(int[] nums) {
		int evenNumbers = 0;
		for (int i = 0; i < nums.length; i++) {
			int result = ((int) Math.log10(nums[i]) + 1) % 2;
			if (result == 0) {
				evenNumbers++;
			}
		}
		return evenNumbers;
	}

	public static int findNumbersBest(int[] nums) {
		int evenNumbers = 0;
		for (int i = 0; i < nums.length; i++) {
			int countDigits = 0;
			int temp = nums[i];
			if (temp < 0) {
				temp = temp * -1;
			}
			while (temp > 0) {
				countDigits++;
				temp = temp / 10;
			}
			int result = countDigits % 2;
			if (result == 0) {
				evenNumbers++;
			}
		}
		return evenNumbers;
	}

}
