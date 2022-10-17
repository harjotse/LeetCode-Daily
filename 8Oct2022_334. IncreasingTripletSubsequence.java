// this approach is great it will tell new type of 3 pointer (Alisha )
// take fir sec and then our cur ele will be found by loop
// now if cur is smaller than fir update
// if cur is gre than fir but smaller than sec update 
// if its bigger than both mean fir<sec<cur return true that's it 
class solution {
    public boolean increasingTriplet(int[] nums) 
    {
    int fir=Integer.MAX_VALUE;     // taken max val coz we are comparing with small
     int sec=Integer.MAX_VALUE;    
        for(int num:nums)
        {
            if(num<=fir)
                fir=num;
            else if(num>fir && num<=sec)
                sec=num;
            else
                return true;
        }
        return false;
    }
    }
    
    
    
    // 3pointer approach it worked on 62/76 cases till the triplets were in line 
    // On sol itself 
    // class Solution {
    //     public boolean increasingTriplet(int[] nums) 
    //     {
    //         int n=nums.length;
    //       for(int i=0;i<n-2;i++)
    //       {
    //           int j=i+1;
    //           int k=i+2;
    //           System.out.println(nums[i] +" "+nums[j]+" "+nums[k]);
    //         //  while(j<n-1 && k<n-2){
    //           if(nums[i]<nums[j] && nums[j]<nums[k]){
    //           return true;
    //           }
    //         }
          
    //         return false;
    //     }
    // }
    
    
    // google 
    