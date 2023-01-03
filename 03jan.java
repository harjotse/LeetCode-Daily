// Approach use two loops one for choosing a particular word for each string
// Other for for comparing like ["cba","daf","ghi"] a with b its check a next ele with previous one


class Solution {
    public int minDeletionSize(String[] strs) {
        int oddOne=0;
        int n=strs.length; // whole arr length
        int m=strs[0].length(); // particular word length
        for(int i=0;i<m;i++) { // for coloums
            for(int j=1;j<n;j++) { // for rows 
            if(strs[j].charAt(i) <strs[j-1].charAt(i)){
                oddOne++;
                break;    
            }      
        }  
    }
        return oddOne;
   }
}
//https://leetcode.com/problems/delete-columns-to-make-sorted/