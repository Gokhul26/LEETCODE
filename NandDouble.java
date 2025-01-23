//https://leetcode.com/problems/check-if-n-and-its-double-exist/description/

import java.util.HashSet;

public class NandDouble {
    class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(2 * num) || (set.contains(num/2) && (num % 2 == 0))){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
}
