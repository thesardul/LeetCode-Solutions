class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        int maxHeight = 0;
        while(l < r){
            if(height[l] > maxHeight && height[r] > maxHeight){
                maxHeight = Math.min(height[l], height[r]);
                maxArea = Math.max(maxArea, maxHeight * ( r - l));
            }
            if (height[l] == height[r]) {
                l ++;
                r --;
            } else if (height[l] < height[r]) {
                l ++;
            } else {
                r --;
            }
        }
        return maxArea;
    }
}