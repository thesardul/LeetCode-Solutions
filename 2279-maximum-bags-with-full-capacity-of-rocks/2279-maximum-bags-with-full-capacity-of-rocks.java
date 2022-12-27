class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int k) {
        int[] count = new int[rocks.length];
        int n = rocks.length, i;
        for ( i = 0; i < n; ++i) 
            count[i] = capacity[i] - rocks[i];
        Arrays.sort(count);
        for ( i = 0; i < n && k >= count[i]; ++i)
            k -= count[i];
        return i;
    }
}