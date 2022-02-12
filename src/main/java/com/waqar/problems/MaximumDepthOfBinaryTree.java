package com.waqar.problems;

import java.util.Queue;
import java.util.Stack;

import com.fasterxml.jackson.core.TreeNode;

public class MaximumDepthOfBinaryTree {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
    public int maxDepth(TreeNode root) {
      
	if(root==null) {
		return 0;
	}

	Queue<TreeNode> queue = new LinkedList<>();
	queue.offer(root);

	int currDepth = 0;
	while(!queue.isEmpty()) {

		// the depth of the level being processed
		currDepth++;

		int size = queue.size();
		for(int i=0; i< size; i++) {

			TreeNode node = queue.remove();                

			if(node.left!=null) {
				queue.offer(node.left);
			}

			if(node.right!=null) {
				queue.offer(node.right);
			}
		}

	}

	return currDepth;
    }
    
    public int DFSR(TreeNode root){
        if(root == null) {
            return 0;
        }
        
        System.out.println("before"+root.val);
        int left = DFSR(root.left);
        int right = DFSR(root.right);
        
        System.out.println("after"+root.val);
        return Math.max(left,right)+1;
        
    }
    public int BFSR(TreeNode root){
        if(root == null) {
            return 0;
        }
        
        System.out.println("before"+root.val);
        int left = BFSR(root.left);
        int right = BFSR(root.right);
        
        System.out.println("after"+root.val);
        return Math.max(left,right)+1;
        
    }
    public int DFS(TreeNode root){
        if(root == null) {
        return 0;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> value = new Stack<Integer>();
        
        stack.push(root);
        value.push(1);
        int max = 0;
        
        while(!stack.isEmpty()){
            TreeNode n = stack.pop();
            int temp = value.pop();
            max = Math.max(temp,max);
          
            if(n.left != null){
                stack.push(n.left);
                value.push(temp+1);
            }
              if(n.right != null){
                stack.push(n.right);
                value.push(temp+1);
            }
            System.out.println(temp);
        }
        return max;
        
    }
    public int BFS(TreeNode root){
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.offer(root);
        int count = 0;
            System.out.println("queue add  "+root.val);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            System.out.println("queue size "+size);
            while(size-- > 0){
                
                System.out.println("queue size inside "+size);
                TreeNode node = queue.poll();
                System.out.println("queue remove");

                if(node.left != null){
                    queue.offer(node.left);
                System.out.println("queue add left "+node.left.val);
                }
                if(node.right != null){
                    queue.offer(node.right);
                System.out.println("queue add right "+node.right.val);
                }
                
            }

            count++;
        }
        return count;
        
    }

}
