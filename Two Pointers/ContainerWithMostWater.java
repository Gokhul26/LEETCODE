//https://leetcode.com/problems/container-with-most-water/
class ContainerWithMostWater {
    public static void main(String[] args) {

            public int maxArea(int[] height) {
                int left = 0;
                int right = height.length - 1;
                int maxArea = 0;
                while(left < right){
                    if(height[left] < height[right]){
                        maxArea = Math.max(maxArea, (height[left] * (right - left)));
                        left +=1;
                    }else{
                        maxArea = Math.max(maxArea, (height[right] * (right - left)));
                        right -= 1;
                    }
                }
                return maxArea;
                
            }
        }

}