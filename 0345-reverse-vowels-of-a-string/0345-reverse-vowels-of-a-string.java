class Solution {
    public String reverseVowels(String s) {
        //Create StringBuilder for replacing characters
        StringBuilder st = new StringBuilder(s);
        //Create empty Stack as a LIFO structure
        Stack<Character> vowelist = new Stack<>();
        //Iterate through characters
        for(int i = 0; i < s.length(); i++){
            //Test if the letter is a vowel
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'I'){
                //Add vowel to stack
                vowelist.push(s.charAt(i));
            }
        }
        //Iterate again
        for(int i = 0; i < s.length(); i++){
            //Test vowel
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'I'){
                //Replace vowel
                st.setCharAt(i, vowelist.pop());
            }
        }
        //Return String representation of StringBuilder
        return st.toString();
    }
}