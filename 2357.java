//https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/

public class 2357 {
    class Solution {
        public int minimumOperations(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
    
            Arrays.sort(nums);
    
            int n = nums.length;
    
            for(int i = 0 ; i < n ; i++){
                if(nums[i] != 0){
                    set.add(nums[i]);
                }
            }
    
            return set.size();
        }
    }
}
