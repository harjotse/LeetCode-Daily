class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int n=s.length();
        String ans="";
        int i=0;
        while(i<numRows){
            int incre=2*(numRows-1);
            int j=i;
            while(j<n){
                ans+=s.charAt(j);
                if(i>0 && i<numRows-1 && j+incre-2*i<n){
                    ans+=s.charAt(j+incre-2*i);
                }
                j+=incre;
            }
            i++;
        }
        return ans;
    }
}