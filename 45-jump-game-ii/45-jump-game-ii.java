class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int cur = 0, far = 0;
        for(int i = 0; i < nums.length; i++){
            if(far < i) return 0;
            far = Math.max(far, nums[i] + i);
            if(cur == i && i != nums.length - 1){
                cur = far;
                ans++;
            }
        }
        
        return ans;
    }
}