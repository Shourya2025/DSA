class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0 ;
        StringBuilder sm = new StringBuilder(pref);
        for(int i = 0 ; i < words.length ;i++){
            if(words[i].length() >= pref.length()){
            if(words[i].substring(0,pref.length()).equals(pref)){
                cnt++;
            }}
        }
        return cnt ;


    }
}