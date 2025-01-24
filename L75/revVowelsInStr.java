//https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75

package L75;

public class revVowelsInStr {
    class Solution {
        public String reverseVowels(String s) {
            int l = 0;
            char[] ch = s.toCharArray();
            int r = ch.length - 1;
            while(l < r){
                while(l < r && (ch[l]!='a' && ch[l]!='e' && ch[l]!='i' && ch[l]!='o' && ch[l]!='u' &&
                      ch[l]!='A' && ch[l]!='E' && ch[l]!='I' && ch[l]!='O' && ch[l]!='U')){
                        l ++;
                      }
                while(l < r && (ch[r]!='a' && ch[r]!='e' && ch[r]!='i' && ch[r]!='o' && ch[r]!='u' &&
                      ch[r]!='A' && ch[r]!='E' && ch[r]!='I' && ch[r]!='O' && ch[r]!='U')){
                        r --;
                      }
    
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
    
            return new String(ch);
        }
    }
}
