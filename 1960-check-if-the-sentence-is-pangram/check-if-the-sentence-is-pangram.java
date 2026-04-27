class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] ans = new boolean[26] ;
        if(sentence.length() < 26){
            return false ;
        }
        for(int i = 0 ; i < sentence.length() ; i++){
            char ch = sentence.charAt(i);
            int val = ch - 'a';
            ans[val] = true;
        }
        for(int j = 0 ; j < ans.length ; j++){
            if(ans[j] == false){
                return false;
            }
        }
        return true;
    }
}