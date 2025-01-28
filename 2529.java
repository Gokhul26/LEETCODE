//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

public class 2529 {
    class Solution {
        public int maximumCount(int[] nums) {
            int posCount = positiveCount(nums);
            int negCount = negativeCount(nums);
            return Math.max(posCount, negCount);
        }
    
        private int positiveCount(int[] nums){
            int left = 0 ;
            int right = nums.length - 1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid] <= 0){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return nums.length - left;
        }
    
        private int negativeCount(int[] nums){
            int left = 0 ;
            int right = nums.length - 1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid] < 0){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return left;
        }
    }
}
