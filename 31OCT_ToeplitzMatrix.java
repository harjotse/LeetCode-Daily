// avoid upper boundary ele
class Solution {
    public boolean isToeplitzMatrix(int[][] nums) {
        for(int i=1; i<nums.length;i++)
        {
            for(int j=1;j<nums[0].length;j++)
            {
                if(nums[i][j]!=nums[i-1][j-1])
                    return false;
            }
        }
        
        return true;
    }
}
//https://leetcode.com/problems/toeplitz-matrix/