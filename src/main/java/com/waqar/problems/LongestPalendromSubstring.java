package com.waqar.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Waqar Ahmad
 *
 * March 15, 2022
 */
public class LongestPalendromSubstring {

    public static void main(String[] args) {

        String s = "babad";


        System.out.println(minimumValue);
    }

    public static String subString(String s){

        if(s.length()  == 1){
            return s;
        }
        String as = "babad";
        String longest = "";
        char[] array = s.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        String substring = "";
        for (int i = 0,j = 0; i <= array.length; i++) {
            String substring = "";
            if(isPalendrom(array,i,j)){

            }
            map.put(array[i],i);
            longest = Math.max(map.);
        }



        return s;

    }

    private static boolean isPalendrom(char[] str, int a, int b) {

        int size = str[a] - str[b];

        while(){

        }



    return true;
    }
}
