package problems;

import java.util.Scanner;

/**
 * @author Waqar Ahmad
 *
 * Sep 27, 2021
 */

public class MinDistinct {
	private int getInput() {

		System.out.println("Enter Number:");
		Scanner input = new Scanner(System.in);
		
		return input.nextInt();
	}
	public void getBinaryGap() {
		Integer input = getInput();
		String binaryArray=  Integer.toBinaryString(input);
		char[] charArray= binaryArray.toCharArray();
		

		int highestGap = 0;
		int countZero = 0;
		for (Character c : charArray) {
			if(c == '0') {
				countZero++;
			} else {
				if(countZero > highestGap) {
					highestGap = countZero;
				}
				countZero = 0;
			}
		}
		
		System.out.println(highestGap);
		
	}
	
}
