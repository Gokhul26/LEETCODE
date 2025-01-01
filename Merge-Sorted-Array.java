//https://leetcode.com/problems/merge-sorted-array/description/?envType=problem-list-v2&envId=array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for(int i = m; i < m+n; i++){
            nums1[i] = nums2[index];
            index++;
        }
        for(int i = 0; i < nums1.length; i++){
            for(int j = i + 1; j < nums1.length; j++){
                int temp = 0;
                if(nums1[j] < nums1[i]){
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}