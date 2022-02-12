package com.waqar.problems;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = { 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n', 'n' };
        System.out.println(ceilOfNumber(letters, 'e'));
    }

    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    static char ceilOfNumber(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
