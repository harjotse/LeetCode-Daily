class Solution {
    Set<List<Integer>> ans ; 
    public List<List<Integer>> findSubsequences(int[] nums) {
        ans = new HashSet();
        ArrayList<Integer> temp = new ArrayList<>();
        rec(nums,0,temp);
        return (new ArrayList(ans));
    }
    void rec(int[]nums,int index,ArrayList<Integer>temp){
        if(temp.size()>=2){
            ans.add(new ArrayList(temp));
        }
        for(int i=index;i<nums.length;i++){
            if(temp.size()==0 || temp.get(temp.size()-1)<=nums[i]){
                temp.add(nums[i]);
                rec(nums,i+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
//https://leetcode.com/problems/non-decreasing-subsequences/