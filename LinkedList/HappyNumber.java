//https://leetcode.com/problems/happy-number/

package LinkedList;

public class HappyNumber {
    class Solution {
        public boolean isHappy(int n) {
            int fast = n;
            int slow = n;
            do{
                slow = findSq(slow);
                fast = findSq(findSq(fast));
            }while( slow != fast );
    
            if(slow == 1){
                return true;
            }
            return false;
    
        }
    
        public int findSq(int num){
            int ans = 0;
            while(num > 0){
                int rem = num % 10;
                ans += rem * rem;
                num /= 10;
            }
            return ans;
        }
    }
}
