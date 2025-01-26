//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

public class 2011 {
    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            int x ;
            int len = operations.length;
            int plus = 0, minus = 0;
            for(int i = 0 ; i < len ; i++){
                if(operations[i].equals("--X") || operations[i].equals("X--")){
                    minus +=1;
                }
                if(operations[i].equals("++X") || operations[i].equals("X++")){
                    plus +=1;
                }
            }
            x = plus - minus;
            return x;
        }
    }
}
