//https://leetcode.com/problems/type-of-triangle/

import java.util.HashSet;

public class triangleType {
    class Solution {
    public String triangleType(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        if(nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[1] + nums[2] <= nums[0]){
            return "none";
        }
        if(set.size() == 1){
            return "equilateral";
        }else if(set.size() == 2){
            return "isoceles";
        }else{
            return "scalene";
        }
    }
}
}
