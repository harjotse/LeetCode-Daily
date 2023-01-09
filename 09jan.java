// approach 1 with rec and add all fx
// addAll explaination addAll method, appends all of the elements in the specified collection to the end of this list.
//during each call to preorderTraversal a new result list gets created, the content of which will be appended to the result list created first. We finally return the result list created first.

// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {  // every time the val passed will act as a root 
//         List<Integer>ans= new LinkedList<Integer>();
//         if(root==null){ // root will be. checked 
//             return ans;
//         }
        
//        ans.add(root.val);
//        ans.addAll(preorderTraversal(root.left)); 
//         ans.addAll(preorderTraversal(root.right)); 
//         return ans;
//     }
// }




// approach no 2 with rec only but no addAll fx basically we will pass the list with call so that it add the ele in the list
// 1 fx one for rec call and return 
// 2fx for internal working of the rec call 
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) { 
//         List<Integer> ans=new LinkedList<>();
//         recHelper(ans,root);
//         return ans;
//     }
//     public void recHelper(List<Integer> ans, TreeNode root)
//     {
//         if(root==null){
//         return ;   // one more thing since return type is void we cant return list we will just simply go back without giving anything 
//         }
//         ans.add(root.val);
//         recHelper(ans,root.left);
//           recHelper(ans,root.right); // why no return coz changes are done in origainal list itself
//         }
// }




// iterative way no rec using stack
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) { 
        List<Integer> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Stack<TreeNode> st= new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty())
        {
            root=st.pop();       //ROOT
            ans.add(root.val);
         
             if(root.right!=null) // Right
            {
                st.push(root.right);
            }
            
            if(root.left!=null)  //Left
            {
                st.push(root.left);
            }  
        }
      return ans;
    }
}
//https://leetcode.com/problems/binary-tree-preorder-traversal/