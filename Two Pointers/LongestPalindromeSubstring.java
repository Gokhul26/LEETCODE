//https://leetcode.com/problems/longest-palindromic-substring/

import java.util.ArrayList;

public class LongestPalindromeSubstring {
    class Solution {
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
