//https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.HashSet;

public class IntersectionOfTwoArrs {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        for(int i = 0 ; i < nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int num : nums2){
            if(set.contains(num)){
                intersectionSet.add(num);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for(int num : intersectionSet){
            result[index++] = num;
        }

        return result;
    }

}
}
