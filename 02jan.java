class Solution {
    public boolean detectCapitalUse(String s) {

        boolean small = false, cap = false;
        for(int i=1; i<s.length(); i++){
            if(small && Character.isUpperCase(s.charAt(i))) return false;
            if(cap && Character.isLowerCase(s.charAt(i))) return false;

            if(Character.isUpperCase(s.charAt(i))) cap = true;
            if(Character.isLowerCase(s.charAt(i))) small = true;
        }
        
        if(cap && Character.isLowerCase(s.charAt(0))) return false;
        
        return true;
    }
}
//https://leetcode.com/problems/detect-capital/