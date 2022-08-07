class Solution {
    public int strStr(String haystack, String needle) {
        int res = 0;
        if(needle.length() == 0)
           res = 0;
        else if(haystack.contains(needle))
            res = haystack.indexOf(needle);
        else
            res = -1;
        return res;
    }
}