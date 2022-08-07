class Solution {
    public int[] shuffle(int[] nums, int n) {
     int a[] = new int[nums.length];
        int temp = 0;
        for(int i = 0,j = (n); i < n; i++,j++){
            a[temp] = nums[i];
            temp++;
            a[temp] = nums[j];
            temp++;
        }
        return a;
    }
}