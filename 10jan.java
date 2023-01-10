// dont comlicate just think 
//we can check by applying traversal 
// bfs will not work y see the eg2 
// now we have 3 dfs use any one 
// below used is preorder 
// dry run must or you will be confused rest chk notes 
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if(p==null && q==null) // both null good to go
           return true;
        if(p==null || q==null) // only one null not good
        return false;
        if(q.val!=p.val)
        return false ;
     
    return (isSameTree(p.left,q.left)&&(isSameTree(p.right,q.right))); //now if this doesnt gives false then it will return true at the end basically its a rec call 
    }
}
//https://leetcode.com/problems/same-tree/