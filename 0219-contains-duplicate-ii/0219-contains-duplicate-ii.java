class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hMap = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            if(hMap.containsKey(nums[i])){
                int temp = nums[i];
                if(Math.abs(hMap.get(temp) - i) <= k){
                    return true;
                }
                hMap.put(nums[i], i);
            }
            else{
                hMap.put(nums[i], i);
            }
        }
        return false;
    }
}