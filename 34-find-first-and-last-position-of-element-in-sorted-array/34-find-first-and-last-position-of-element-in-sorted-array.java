class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1, -1};
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);
        return res;
    }
    
    public int findFirst(int[] a, int x){
        int idX = -1;
        int lo = 0, hi = a.length - 1;
        while(lo <= hi){
            int m = lo + ((hi - lo) >> 1);
            
            if(a[m] == x){
                idX = m;
                hi = m - 1;
            }
            else if(a[m] < x){
                lo = m + 1;
            }
            else
                hi = m - 1;
        }
        return idX;
    }
    
    public int findLast(int[] a, int x){
        int idX = -1;
        int lo = 0, hi = a.length - 1;
        while(lo <= hi){
            int m = lo + ((hi - lo) >> 1);
            
            if(a[m] == x){
                idX = m;
                lo = m + 1;
            }
            else if(a[m] < x){
                lo = m + 1;
            }
            else
                hi = m - 1;
        }
        return idX;
    }
}