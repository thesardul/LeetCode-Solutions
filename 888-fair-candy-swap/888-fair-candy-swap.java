class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        int aSum = 0, bSum = 0;
        
        for(int i = 0; i < a.length; i++){
            aSum += a[i];
        }
        for(int i = 0; i < b.length; i++){
            bSum += b[i];
        }
        
        int diff = aSum - bSum; // -2
        for(int i = 0; i < a.length; i++){
            int lo = 0, hi = b.length - 1;
            int s = -(diff - 2 * a[i]) / 2;
            while(lo <= hi){
                int m = lo + ((hi - lo) >> 1);
                if(b[m] == s){
                    return new int[]{a[i], b[m]};
                }
                else if(b[m] > s){
                    hi = m - 1;
                }
                else{
                    lo = m + 1;
                }
            }
        }
        return new int[]{};
    }
}
