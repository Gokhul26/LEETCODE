//https://leetcode.com/problems/find-the-difference/

public class FindDiff {
    class Solution {
        public char findTheDifference(String s, String t) {
            int sSum = 0;
            int tSum = 0;
            for(char ch : s.toCharArray()){
                sSum += ch;
            }
    
            for(char cha : t.toCharArray()){
                tSum += cha;
            }
    
            return (char) (tSum - sSum);
        }
    }
}
