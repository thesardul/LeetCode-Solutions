class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int len = nums.length;
        int nSum = len * (len + 1)/2;
        int dup = 0;
        for(int i = 0; i < len; i++){
            if(hashMap.containsKey(nums[i])){
                dup = nums[i];
                break;
            }else 
                hashMap.put(nums[i], 0);
        }
        int arrSum = 0;
        for (int i : nums)
            arrSum += i;
        arrSum = arrSum - dup;
        return new int[]{dup, (nSum - arrSum)};
    }
}