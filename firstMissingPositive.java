//https://leetcode.com/problems/first-missing-positive/description/

public class firstMissingPositive {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int i = 0;
            int n = nums.length;
            
            while(i < n){
                int crct = nums[i] - 1;
                if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[crct] ){
                    swap(nums, i , crct);
                }else{
                    i++;
                }   
            }
    
            for(int index = 0; index < nums.length; index++){
                if(nums[index] != index+1){
                    return index + 1;
                }
            }
    
            return nums.length + 1;
        }
    
        void swap(int[] nums, int first, int sec){
            int temp = nums[first];
            nums[first] = nums[sec];
            nums[sec] = temp;
        }
    }
    
    
}
