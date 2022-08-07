class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            int j = i+1;
            if( j <= nums.length && nums[i] == nums[j]){
                return nums[i];
            }
        }
        return 0;
    }
}