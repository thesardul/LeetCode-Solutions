class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int lo = 1, hi = 0;
        for(int i = 0; i < p.length; i++){
            if(hi < p[i])
                hi = p[i];
        }
        int ans = hi;
        while(lo <= hi){
            int m = lo + ((hi - lo) >> 1);
            if(check(m, p) <= h){
                ans = m;
                hi = m - 1;
            }
            else
                lo = m + 1;
        }
        return ans;
    }
    public int check(int speed, int[] p){
        int timeTaken = 0;
        for(int i = 0; i < p.length; i++){
            timeTaken += Math.ceil((p[i] * 1.0) / speed);
        }
        return timeTaken;
    }
}