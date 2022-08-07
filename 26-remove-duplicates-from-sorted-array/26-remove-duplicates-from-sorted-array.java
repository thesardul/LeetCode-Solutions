class Solution {
    public int removeDuplicates(int[] arr) {
        if(arr.length == 0) return 0;
        
        
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res]) {
                res++;
                arr[res] = arr[i];                
            }
        }
        return res + 1;
    }
}