//https://leetcode.com/problems/add-to-array-form-of-integer/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = n - 1; i >= 0; i--){
            k += num[i];
            list.add(k % 10);
            k /= 10;
        }
        while(k > 0){
            list.add(k % 10);
            k /= 10;
        }
        Collections.reverse(list);
        return list;
        
    }
}