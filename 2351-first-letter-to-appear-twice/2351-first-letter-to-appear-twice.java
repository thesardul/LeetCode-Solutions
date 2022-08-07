class Solution {
    public char repeatedCharacter(String s) {
        char ch = '\0';
        int n = s.length();
        HashSet<Character> st = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(st.contains(s.charAt(i))){
                ch = s.charAt(i);
                break;
            }
            else
                st.add(s.charAt(i));
        }
        return ch;
    }
}