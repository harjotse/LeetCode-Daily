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

// very easy code 
// you will learn about when to add +1 for root and when not to add
// plus the code is very simple but dry run else will get confuse

//approach 
// find the L and R using 2 fx
// 2 check con if full tree and if not full tree 



class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        
        int left=leftL(root); // fx calls
        int right=rightL(root);
        
        
        if(right==left){
             System.out.print(left);
        return ((2<<left)-1);
        }
        // now point to note why we doing rec call in return why not simple way
        // coz while its calc the tree na it will return the ans to each call
        // and after final call it will give the ans only 
        else
        return countNodes(root.left)+countNodes(root.right)+1;
    }
       
    // L call 
   public int leftL(TreeNode root)
   {
       int count =0;
       while(root.left!=null)
       {
           count++ ;
           root=root.left;
       }
      
       return count ;
   }
      
    // R call
    public int rightL(TreeNode root)
   {
       int count =0;
       while(root.right!=null)
       {
           count ++;
           root=root.right;
       } 
       return count ; 
   }
 
}

//https://leetcode.com/problems/count-complete-tree-nodes/