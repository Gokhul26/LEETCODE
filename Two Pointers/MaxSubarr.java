//https://leetcode.com/problems/maximum-subarray/description/?envType=problem-list-v2&envId=dynamic-programming

public class MaxSubarr {
    class Solution {
        public int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i = 0; i < nums.length; i++){
                if(sum < 0 ){
                    sum = 0;
                }
                sum += nums[i];
                max = Math.max(sum,max);
            }
    
            return max;
        }
    }
}
