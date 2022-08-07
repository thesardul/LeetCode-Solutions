class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int prod = 1, sum = 0;
        while(temp > 0){
            int temp1 = temp % 10;
            prod *= temp1;
            sum += temp1;
            temp = temp / 10;
        }
        return prod - sum;
    }
}