class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getSubSets(ans, nums, new ArrayList<>(),0);
        return ans;
    }
    
    public void getSubSets(List<List<Integer>> subset, int[] nums, ArrayList<Integer> out, int i){
        if(i == nums.length){
            subset.add(out);
            return;
        }
        getSubSets(subset, nums, new ArrayList<>(out), i+1);
        out.add(nums[i]);
        getSubSets(subset, nums, new ArrayList<>(out), i+1);
    }
}