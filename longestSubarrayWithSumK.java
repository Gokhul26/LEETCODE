// this is not a leetcode sum. 


public class longestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3,3};
        int k = 6;
        System.out.println(func(arr,k));

    }

    static int func(int[] arr, int k){
        int left = 0, right = 0,maxLength = 0, sum = 0;
        while(right < arr.length){
            sum += arr[right];
            if(sum == k){
                maxLength = Math.max(maxLength,right - left + 1);
            }
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return maxLength;
    }
    
}
