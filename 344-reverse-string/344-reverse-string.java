class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int lo = 0, hi = len - 1;

        while( lo <= hi){
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            hi--;
            lo++;
        }
    }
}