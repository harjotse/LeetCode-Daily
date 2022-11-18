class Solution {
    public int maximum69Number (int num) {
        StringBuilder str=new StringBuilder ();
        str.append (num);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='6'){
               str.setCharAt(i,'9');
            break; // why break ? coz we have to change only once 
            }
        }
               return Integer.parseInt(str.toString()); // strBuilder-->string--->int
    }
}

// remember that just add ""+int == string 
// 2nd method
class Solution {
    public int maximum69Number (int num) {
        String str=""+num;
        return  Integer.parseInt(str.replaceFirst("6","9"));
    }
}

//https://leetcode.com/problems/maximum-69-number/