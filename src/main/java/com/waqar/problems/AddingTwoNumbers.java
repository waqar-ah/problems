package com.waqar.problems;

import java.util.ArrayList;

// https://leetcode.com/problems/add-two-numbers/

public class AddingTwoNumbers {

    public static void main(String[] args) {

/**
 * loop over both lists
 * calculate sum and Carry and add to new list
 * check if carry exist sum /10
 * 
 * 
 */

       
    }

}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode();
         ListNode p = l1, q = l2, curr = result;
        
        int carry = 0;
        
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = 0;
            sum = x + y + carry;
        System.out.println("sum "+sum);
            carry = sum/10;
        System.out.println("carry "+carry);
            
            result.next = new ListNode(sum%10);
            result = result.next;
            
            if(p != null){
                p = p.next;
            }
             if(q != null){
                q = q.next;
            }
        }
         
            if(carry > 0){
             result.next = new ListNode(carry);
            }
        
        return curr.next;
        
    }
}