class Solution {
    public int reverse(int x) {
        if (x < 0) {
            if (x == Integer.MIN_VALUE) {
                return 0;
            } else {
                return reverse(-x) * -1;
            }
        }
        int n = 0;
        int max = Integer.MAX_VALUE/10;
        while (x > 0) {
            n = n*10 + x%10;
            x = x / 10;
            if (n > max && x > 0) {
                return 0;
            }
        }
        return n;
    }
}