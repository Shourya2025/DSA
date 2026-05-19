class Solution {
    public boolean isPalindrome(String s){
        StringBuilder sm = new StringBuilder(s);
        return sm.toString().equals(sm.reverse().toString());
    }
    String ans = "";
    public String firstPalindrome(String[] words) {
        for(int i = 0  ; i < words.length ; i++){
            if(isPalindrome(words[i])){
                 ans = words[i];
                break;
            }
        }
        return ans;
    }
}