class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
       List<List<Integer>> res = new ArrayList<>();
       HashMap<String,Integer> wordMap= new HashMap<>();
       for(int i=0;i<words.length;i++){
           wordMap.put(reverseString(words[i]),i);
       }
       for(int i=0;i<words.length;i++){
           String word=words[i];
           if(isPalindrome(word)&&wordMap.containsKey("")&&wordMap.get("")!=i){
               res.add(Arrays.asList(i,wordMap.get("")));
               res.add(Arrays.asList(wordMap.get(""),i));
               
           }
           //String reverseWord=reverseString(word);
           if(wordMap.containsKey(word)&&wordMap.get(word)!=i){
               res.add(Arrays.asList(i,wordMap.get(word)));
           }
           //0-j,j-s.word.length()-1;
           //s1s2
           for(int j=1;j<word.length();j++){
               String s1=word.substring(0,j);
               String s2=word.substring(j,word.length());
               // String reverseS1=reverseString(s1);
               // String reverseS2=reverseString(s2);
               if(wordMap.containsKey(s1)){
                   if(isPalindrome(s2)){
                       res.add(Arrays.asList(i,wordMap.get(s1)));
                   }
               }
               if(wordMap.containsKey(s2)){
                   if(isPalindrome(s1)){
                       res.add(Arrays.asList(wordMap.get(s2),i));
                   }
               }
           }
               
       }
        return res;
        
    }
    private boolean isPalindrome(String s){
        if(s.length()<=1)return true;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    private String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
}