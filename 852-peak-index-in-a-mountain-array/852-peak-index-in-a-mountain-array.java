class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        int temp = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(temp < arr[i]){
                peak = i;
                temp = arr[i];
            }
        }
        return peak;
    }
}