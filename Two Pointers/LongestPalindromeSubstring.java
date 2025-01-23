//https://leetcode.com/problems/longest-palindromic-substring/

import java.util.ArrayList;

public class LongestPalindromeSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            if(s == null || s.length() < 1){
                return "";
            }   
    
            int start = 0;
            int end = 0;
    
            for(int i = 0; i < s.length(); i++){
                int len1 = expandaroundcenter(s,i,i);
                int len2 = expandaroundcenter(s,i,i+1);
                int len = Math.max(len1,len2);
    
                if(len > end - start){
                    end = i + len / 2;
                    start = i - (len - 1) / 2;
                }
            }
            return s.substring(start, end + 1);
        }
    
        private int expandaroundcenter(String s, int left, int right){
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            return right - left - 1;
        }
    }


    class Solution1 {
    public String longestPalindrome(String s) {
        ArrayList<String> substrings = new ArrayList<>();
        for(int i = 0; i < s.length(); i ++){
            for(int j = i + 1; j <= s.length(); j++){
                String substring = s.substring(i,j);
                substrings.add(substring);
            }
        } 
        String longestPalindrome= "";
        for(String substring : substrings){
            if(isPalindrome(substring) && substring.length() > longestPalindrome.length()){
                longestPalindrome = substring;;
            }
        }
        return longestPalindrome;
    }

    protected static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() -1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;

    }
}
}
