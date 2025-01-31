//https://leetcode.com/problems/largest-odd-number-in-string/`

public class largestOddNoInStr {
    
    class Solution {
        public String largestOddNumber(String num) {
            // int ans = Integer.parseInt(num);
    
            // if(ans % 2 != 0 ){
            //     return Integer.toString(ans);
            // }
    
            for(int i = num.length() - 1 ; i >= 0; i--){
                int digit = num.charAt(i) - '0';
                if(digit % 2 != 0){
                    return num.substring(0, i + 1);
                }
            }
            return "";
        }
    }
}
