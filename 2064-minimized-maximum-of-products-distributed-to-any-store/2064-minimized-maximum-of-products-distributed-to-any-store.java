class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int lo = 0;
        int hi = 0;
        for(int i = 0; i < q.length; i++){
            if(hi < q[i])
                hi = q[i];
        }
        int ans = hi;
        while(lo <= hi){
            int m = lo + (( hi - lo) >> 1);
            if(check(m, q, n) <= n){
                ans = m;
                hi = m - 1;
            }
            else{
                lo = m + 1;
            }
        }
        return ans;
    }
    public int check(int m, int[] a, int n){
        int y = 0;
        for(int i = 0; i < a.length; i++){
            y += Math.ceil(a[i] * 1.0 / m);
        }
        return y;
    }
}