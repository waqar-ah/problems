package com.waqar.problems;

public class RichestCustomerWealth {

	public static void main(String[] args) {

		int[][] accounts = { {2,8,7}, {7,1,3}, {1,9,5} };
		System.out.println(wealth(accounts));

	}

	static int wealth(int[][] customers) {
		int richest = Integer.MIN_VALUE;
		if(customers.length <=0){
			return richest;
		}
		for (int i = 0; i < customers.length; i++) {
			int customerWealth = 0;
			for (int j = 0; j < customers[i].length; j++) {
				customerWealth = customerWealth + customers[i][j];
			}
			if (customerWealth >= richest) {
				richest = customerWealth;
			}
		}
		return richest;
	}
}
