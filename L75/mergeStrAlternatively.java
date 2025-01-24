//  https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75

package L75;

public class mergeStrAlternatively {
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            int len1 = word1.length();
            int len2 = word2.length();
            char[] ch = new char[len1 + len2];
            int pt1 = 0;
            int pt2 = 0;
            int i = 0;
            while(pt1 < len1 && pt2 < len2){
                ch[i++] = word1.charAt(pt1++);
                ch[i++] = word2.charAt(pt2++);
            }
    
            while(pt1 < len1){
                ch[i] = word1.charAt(pt1);
                i++;
                pt1++;
            }
    
            while(pt2 < len2){
                ch[i] = word2.charAt(pt2);
                i++;
                pt2++;
            }
    
            return new String(ch);
        }
    }
}
