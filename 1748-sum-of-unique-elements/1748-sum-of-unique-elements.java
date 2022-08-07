class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            else {
                hashMap.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> set : hashMap.entrySet()){
            if(set.getValue() < 2){
                sum+= set.getKey();
            }
        }
        return sum;
    }
}