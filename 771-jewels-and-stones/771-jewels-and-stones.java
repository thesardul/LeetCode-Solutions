import java.util.Hashtable;
class Solution {
    public int numJewelsInStones(String jw, String st) {
        int count = 0;
        HashSet<Character> jewelTable = new HashSet<>();
       for (int i = 0; i < jw.length(); i++) {
            jewelTable.add(jw.charAt(i));
        }
        for (int i = 0; i < st.length(); i++) {
            if (jewelTable.contains(st.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}