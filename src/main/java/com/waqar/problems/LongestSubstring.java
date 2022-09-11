package com.waqar.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Waqar Ahmad
 *
 * March 15, 2022
 */

public class LongestSubstring {
    
    public static void main(String[] args) {

        String s = "abcabcbb";

        Integer minimumValue = lengthOfLongestSubstring(s);

        System.out.println(minimumValue);
    }
    public static int lengthOfLongestSubstringLessTime(String s) {
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        if(s.length() == 0 || s == null ||  s == ""){
            return 0;
        }
         if(s.length() == 1){
            return 1;
        }
   
        int max = 0;

         for (int i = 0, j = 0; i < s.length(); i++) {


            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            max =  Math.max(max, i-j+1);
        }
        

        return max;
       
        
    }
    public static int lengthOfLongestSubstring(String s) {
        
        Map<String, Integer> subStringMap = new HashMap<String, Integer>();

        if(s.length() == 0 || s == null ||  s == ""){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        
        char[] arr = s.toCharArray();
        for(int x=0; x <= arr.length-1; x++){
            ArrayList<Character> subString = new ArrayList<Character>();
            for(int i=x; i<= arr.length-1; i++){
                Character ch = arr[i];
                 if(!containsCharacter(subString,ch)){
                    ArrayList<Character> oldSubString = subString;
                     subString.add(ch);
                     subStringMap.put(oldSubString.toString(),subString.size());
                  } else {
                     subStringMap.put(subString.toString(),subString.size());
                     subString = new ArrayList<Character>();
                  }

            }  
        }
        

        return Collections.max(subStringMap.values());
       
        
    }
    public static boolean containsCharacter(ArrayList<Character> s, Character ch) {

        // boolean anyMatch = s.parallelStream().anyMatch(asd -> asd.charValue() == ch);
        for(int i=0; i < s.size(); i++){
            Character str = s.get(i);
            if(str == ch){
                return  true;
            }
        }
        return false;
        
    }
    
}