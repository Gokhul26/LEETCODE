//https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75

package L75;

public class reverseWordsInString {
    class Solution {
        public String reverseWords(String s) {
            if(s.length() == 0 || s.trim().isEmpty()){
                return  "";
            }
    
            StringBuilder ans = new StringBuilder();
    
            String[] words = s.trim().split("\\s+");
    
            for(int i = words.length - 1; i >= 0; i--){
                ans.append(words[i]);
                if(i != 0){
                    ans.append(" ");
                }
            }
    
            return ans.toString();
        }
    }
}
