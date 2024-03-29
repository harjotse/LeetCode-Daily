class Solution {
    public int jump(int[] nums) {
        int n = nums.length; // length of the nums array
        int jumps = 0; // number of jumps needed to reach the end
        int curEnd = 0; // farthest index that can be reached with the current number of jumps
        int curFarthest = 0; // farthest index that can be reached from the current index
        
        // iterate over the nums array from 0 to n - 1
        for (int i = 0; i < n - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]); // update curFarthest with the maximum distance that can be reached from this index
            
            // if i is equal to curEnd, we have reached the farthest possible index with the current number of jumps
            if (i == curEnd) {
                jumps++; // increment jumps by 1
                curEnd = curFarthest; // update curEnd with the new farthest index
            }
        }
        return jumps;
    }
}