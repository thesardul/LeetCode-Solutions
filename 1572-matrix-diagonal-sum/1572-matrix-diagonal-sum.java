class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int result = 0;
        for(int i = 0; i < len; i++){
            result += mat[i][i];
            result += mat[i][len-1-i];
        }
        return len%2==0 ? result : result - mat[len/2][len/2];
    }
}