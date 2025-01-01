//https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=array

public class singleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
