class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> aList = new ArrayList<>();
        int o = 0;
        int c = 0;
        solve(n, "", o, c, aList);
        return aList;
    }
    
    public void solve(int n, String s, int o, int c, List<String> l){
        if(o == n && c == n){
            l.add(s.toString());
            return;
        }
        if(o < n){
            solve(n, s + "(",o+1, c, l);
        }
        if(c < o)
            solve(n, s+")" ,o, c+1,l);
    }
}