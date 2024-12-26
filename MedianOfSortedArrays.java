// https://leetcode.com/problems/median-of-two-sorted-arrays/?envType=problem-list-v2&envId=array

public class MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalArray = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            finalArray[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            finalArray[nums1.length + i] = nums2[i]; 
        }

        int length = finalArray.length;

        for(int i = 0; i < finalArray.length; i++){
            for(int j = i + 1; j < finalArray.length; j++){
                int temp = 0;
                if(finalArray[j] < finalArray[i]){
                    temp = finalArray[j];
                    finalArray[j] = finalArray[i];
                    finalArray[i] = temp;
                }
            }
        }

        if(length % 2 != 0){
            float index = length / 2;
            int index1 = (int)index;
            int median = finalArray[index1];
            return (double)median;
        }else{
            int index = length / 2;
            int ans1 = finalArray[index];
            int ans2 = finalArray[index - 1];
            float medianSum = ans1 + ans2;
            double median = (double)medianSum / 2;
            return median;
        }
    }
}
