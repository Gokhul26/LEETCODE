//https://leetcode.com/problems/alternating-digit-sum/

public class AlternatingDigitSum {
    class Solution {
        public int alternateDigitSum(int n) {
            String s = Integer.toString(n);
    
            int ans = 0;
    
            int factor = 1;
    
            for(int i = 0 ; i < s.length();i++){
                ans += (Character.getNumericValue(s.charAt(i)) * factor) ;
                factor *= -1;
            }
    
            return ans;
        }
    }
}
