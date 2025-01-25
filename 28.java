//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class 28 {
    class Solution {
        public int strStr(String haystack, String needle) {
            if(haystack.length() < needle.length()){
                return -1;
            }
    
            for(int i = 0; i <= haystack.length() - needle.length(); i++){
                if(haystack.substring(i, i + needle.length()).equals(needle)){
                    return i;
                }
            }
    
            return -1;
    
        }
    }
}
