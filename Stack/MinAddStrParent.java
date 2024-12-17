//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/

package Stack;

import java.util.Stack;

public class MinAddStrParent {  
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else{
                if(i+1 < s.length() && s.charAt(i+1) == ')'){
                    i++;
                }else{
                    count++;
                }

                if(stack.isEmpty()){
                    count++;
                }else{
                    stack.pop();
                }
            }
        }
        count += stack.size() * 2;
        return count;
    }

}
