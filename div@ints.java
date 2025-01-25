
// https://leetcode.com/problems/divide-two-integers/
public class div@ints {
    class Solution {
        public int divide(int dividend, int divisor) {
            if(divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
            return dividend/divisor;
        }
    }
}
