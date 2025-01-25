//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class 1281 {
    class Solution {
        public int subtractProductAndSum(int n) {
           int ans = 0;
           int temp = n;
           int temp1 = n;
           int sum = 0;
           int product = 1;
           while(temp > 0){
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
           } 
    
           while(temp1 > 0){
            int rem = temp1 % 10;
            product *= rem;
            temp1 /= 10;
           }
    
           return product - sum;
    
        }
    }
}
