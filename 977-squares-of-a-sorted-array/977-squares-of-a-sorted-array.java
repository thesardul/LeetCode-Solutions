class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] a = new int[nums.length];
        int lo = 0;
        int hi = nums.length - 1;
        
        for(int i = nums.length - 1; i >= 0; i--){
            
            if(Math.abs(nums[lo]) >= Math.abs(nums[hi])){
                a[i] = nums[lo] * nums[lo];
                lo++;
            }
            else{
                a[i] = nums[hi] * nums[hi];
                hi--;
            }
        }
        return a;
    }
}