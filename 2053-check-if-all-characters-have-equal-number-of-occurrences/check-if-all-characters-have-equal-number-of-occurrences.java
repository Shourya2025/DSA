class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character , Integer > hm = new HashMap<>();
        for(int i = 0 ; i < s.length()  ; i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch , hm.get(ch)+1);

            }
            else {
                 hm.put(ch ,1);
            }
        } 
        char ch = s.charAt(0);
        int freq = hm.get(ch);
        for(int freqs : hm.values()){
            if(freqs != freq){
                return false;
            }
        }
        return true;
    }
}