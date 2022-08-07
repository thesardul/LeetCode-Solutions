class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        
        String[] str = s.split(" ");
        if(str.length > 0)
            len = str[str.length-1].length();
        return len;
    }
}