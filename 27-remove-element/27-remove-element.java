class Solution {
    public int removeElement(int[] arr, int val) {
     int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[res++] = arr[i];
            }
        }
        return res;
    }
}