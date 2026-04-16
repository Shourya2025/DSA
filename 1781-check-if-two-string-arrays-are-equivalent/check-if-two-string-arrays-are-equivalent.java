class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sm1 = new StringBuilder();
        StringBuilder sm2 = new StringBuilder();
       for(int i =0 ; i < word1.length ;i++){
            sm1.append(word1[i]);
       }
       for(int j =0 ; j <word2.length ;j++){
            sm2.append(word2[j]);        
       } 
       if(sm1.toString().equals(sm2.toString())){
        return true;
       }
       return false;
    }
}
// Approach is stringbuilder add both strings and then just use .equals() 