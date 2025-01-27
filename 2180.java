//https://leetcode.com/problems/count-integers-with-even-digit-sum/description/

public class 2180 {
    class Solution {
        public int countEven(int num) {
            int count = 0 ;
            for(int i = 1; i <= num;i++){
            if(isEven(i)){
                count++;
            }
            }
    
            return count;
        }
    
        private boolean isEven(int num){
            int ans = 0;
            while(num > 0){
                int rem = num % 10;
                ans += rem;
                num /= 10;
            }
            return ans % 2 == 0;
        }
    }
}
