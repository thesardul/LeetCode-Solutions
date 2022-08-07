class Solution {
    public void moveZeroes(int[] ar) {
        int temp = 0, j = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                j = ar[i];
                ar[i] = ar[temp];
                ar[temp] = j;
                temp++;
            }
        }
    }
}