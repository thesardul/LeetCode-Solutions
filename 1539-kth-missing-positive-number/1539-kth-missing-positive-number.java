class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo = 0;
        int hi = arr.length;
        
        while(lo < hi){
            int m = lo + (hi-lo)/2;
            if(arr[m] - 1 -m < k)
                lo = m + 1;
            else
                hi = m;
        }
        return lo + k;
        
    }
}