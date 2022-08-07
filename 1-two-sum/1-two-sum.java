class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if (hMap.containsKey(temp)) {
				int x = hMap.get(temp);
				return new int[] { i, x };
			} else {
				hMap.put(nums[i], i);
			}
		}
		return nums;
    }
}