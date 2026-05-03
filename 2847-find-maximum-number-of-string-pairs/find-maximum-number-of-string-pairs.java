class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int cnt = 0;
        for(int i = 0 ; i < words.length -1 ; i++){
            for(int j = i+1 ; j < words.length ; j++){
                StringBuilder sm = new StringBuilder(words[j]);
                if(words[i].equals(sm.reverse().toString())){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}