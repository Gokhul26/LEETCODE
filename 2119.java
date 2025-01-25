//https://leetcode.com/problems/a-number-after-a-double-reversal/description/

class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = reverse(num);
        int rev2 = reverse(rev1);
        return num == rev2;
    }

    public int reverse(int n ){
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
}