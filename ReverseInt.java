// https://leetcode.com/problems/reverse-integer/description/

public class ReverseInt {
    public int reverse(int x) {
        long ans = 0;
        while(x != 0){
            int reminder = x % 10;
            ans = (ans*10) + reminder;
            x /= 10;
        }

        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;
        
    }
}
