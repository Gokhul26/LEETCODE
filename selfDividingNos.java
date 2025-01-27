//https://leetcode.com/problems/self-dividing-numbers/

import java.util.ArrayList;
import java.util.List;

public class selfDividingNos {
    class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left ; i <= right; i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }

        return list;
    }

    private boolean isSelfDividing(int x){
        int temp = x;
        while(temp > 0){
            int rem = temp % 10;
            if(rem == 0 ){
                return false;
            }
            if(x % rem != 0){
                return false;
            }

            temp /= 10;
        }
        return true;
    }
}
}
