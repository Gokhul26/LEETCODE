//https://leetcode.com/problems/find-if-digit-game-can-be-won/

public class 3232 {
    class Solution {
        public boolean canAliceWin(int[] nums) {
            int aSum = 0;
            int bSum = 0;
            for(int i = 0 ; i < nums.length; i++){
                if(nums[i] < 10){
                    aSum += nums[i];
                }else{
                    bSum += nums[i];
                }
            }
    
            return aSum != bSum;
        }
    }
}
