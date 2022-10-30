class Solution {
    public String convertToTitle(int A) {
        String res="";
        while (A>0){
            int temp = (A-1)%26;
            res = (char)('A'+temp)+res;
            A=(A-1)/26;
        }
        return res;
    }
}