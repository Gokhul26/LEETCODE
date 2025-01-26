//https://leetcode.com/problems/smallest-even-multiple/

public class smallestEvenMultiple {
    class Solution {
        public int smallestEvenMultiple(int n) {
            if(n % 2 == 0 && n % n == 0){
                return n;
            }
            while(n % 2 != 0){
                n = n * 2;
            }
    
            return n;
        }
    }
}
