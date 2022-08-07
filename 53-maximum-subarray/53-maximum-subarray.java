class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, maxSumHere = 0;
        for(int i = 0; i < nums.length; i++){
            maxSumHere += nums[i];
            if(maxSum < maxSumHere)
                maxSum = maxSumHere;
            if(maxSumHere < 0)
                maxSumHere = 0;
        }
        return maxSum;
        
    }
}