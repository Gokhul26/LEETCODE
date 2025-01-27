//https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/

package Stack;

public class 2696 {
    class Solution {
        public int minLength(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0 ; i < s.length(); i++){
                char currentValue = s.charAt(i);
                if(stack.isEmpty()){
                    stack.push(currentValue);
                    continue;
                }
                if(currentValue == 'B' && stack.peek() == 'A'){
                    stack.pop();
                }
    
                else if(currentValue == 'D' && stack.peek() == 'C'){
                    stack.pop();
                }
                else{
                    stack.push(currentValue);
                }
            }
            return stack.size();
        }
    }
}
