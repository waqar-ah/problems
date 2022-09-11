package com.waqar.problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Waqar Ahmad
 *
 * March 30, 2022
 */

public class MedianOfSoartedArray {
    
    public static void main(String[] args) {
       int[] nums1 = {1,3};
       int[] nums2 = {2};

        List<Double> temp = new ArrayList<Double>();
        int[] list = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();

       
        if(list.length > 0){
            for (int i : list) {
              temp.add((double) i);
          }
          }
        //   if(nums2.length > 0){
        //    for (int i : nums2) {
        //       temp.add((double) i);
              
        //    }
        // }
        
        
        if(temp.size() <= 0){
           
         System.out.println(0);
        }

      Double median = 0.0;

      if(temp.size() % 2 == 1){  // odd
        int location = (temp.size())/2;
        median =  temp.get(location);

      } else { // even
        int locationA = (temp.size())/2;
        int locationB = ((temp.size())/2)+1;
        median =  (temp.get(locationA-1)+temp.get(locationB-1))/2;

      }
      if(median < 0){
        System.out.println(0);
      }

        System.out.println(median);
    }

}