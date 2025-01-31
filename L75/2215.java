//https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75

public class 2215 {
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> list = new ArrayList<>();
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
    
            for(int num : nums1){
                set1.add(num);
            }
    
            for(int num : nums2){
                set2.add(num);
            }
    
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());
    
            for(int num : set1){
                if(!set2.contains(num)){
                    list.get(0).add(num);
                }
            }
    
            for(int num : set2){
                if(!set1.contains(num)){
                    list.get(1).add(num);
                }
            }
    
            return list;
        }
    }
}
