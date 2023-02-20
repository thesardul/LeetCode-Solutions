class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    
    public static int binarySearch(int[] a, int l, int r, int x){
        while(l <= r){
            int m = l + ( r - l) / 2;
            if(a[m] == x)
                return m;
            else if(a[m] > x)
                r = m -1;
            else
                l = m + 1;
        }
        return l;
    }
}