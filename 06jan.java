class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        int leftOver=coins;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++)
        {
            if(leftOver-costs[i]>=0)
            {
                count++;
                leftOver-=costs[i];
            }
        }
        return count;
    }
}
//https://leetcode.com/problems/maximum-ice-cream-bars/ 
//without sorting the main part