class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int t = 1 + (minutesToTest / minutesToDie);
        int cnt = 0;
        int total = 1;
        while (total < buckets) {
            total *= t;
            cnt++;
        }
        return cnt;
    }
}