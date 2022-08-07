class Solution {
    public boolean isMonotonic(int[] ar) {
        boolean isInc = false, isDec = false;
        int temp = ar[0];
        for(int i = 1; i < ar.length; i++) {
            if((temp <= ar[i])){
                temp = ar[i];
                isInc = true;
            }
            else{
                isInc = false;
                break;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if((temp >= ar[i])){
                temp = ar[i];
                isDec = true;
            }
            else{
                isDec = false;
                break;
            }
        }
        
        return isInc || isDec;
    }
}