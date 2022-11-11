class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        if(nums.length==0)
            return 0;
        for(int i=0;i<nums.length-1;i++)
        {
            int j=i+1;
            if(nums[i]!=nums[j])
            {   count++;
             
                nums[count]=nums[j];
                
            }  
        }
        System.out.print(count);
        return count+1;
    }
}
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
