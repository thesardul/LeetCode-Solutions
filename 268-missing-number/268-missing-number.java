class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length - 1;
        
        int tempSum = ((n + 1) * (n + 2)) / 2;
        int temp = 0;
        for(int i = 0; i < n + 1; i++){
            temp += nums[i];
        }
        System.out.println(n + "\t" + tempSum + "\t" + temp);
        return tempSum - temp;
    }
}