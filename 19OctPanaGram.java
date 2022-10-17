class Solution {
    public boolean checkIfPangram(String sentence) {
     HashSet<Character> set=new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            set.add(sentence.charAt(i));
        }
        if(set.size()==26)
            return true;
        
        return false;
    }
}
// 1832 leetcode
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/