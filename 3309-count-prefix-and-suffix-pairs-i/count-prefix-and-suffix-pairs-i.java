class Solution {
    public boolean Valid(String s1 , String s2){
        return s2.startsWith(s1) && s2.endsWith(s1);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0 ;
        for(int i = 0 ; i < words.length-1 ; i++){
            for(int j = i+1 ;  j < words.length ; j++){
                if(words[i].length() <= words[j].length()){
                    if(Valid(words[i] , words[j])){
                        cnt++;
                    }
                }

            }
        }
        return cnt;
    }
}