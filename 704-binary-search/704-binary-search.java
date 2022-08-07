class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    
    public int binarySearch(int[] a, int l, int r, int x){
        if(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] == x)
                return mid;
            if(a[mid] < x)
                return binarySearch(a, mid + 1, r, x);
            return binarySearch(a, l, mid - 1, x);
        }
        return -1;
    }
}