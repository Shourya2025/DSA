class Solution {
    public int digitFrequencyScore(int n) {
        Map<Character , Integer> hm = new HashMap<>();
        String str = String.valueOf(n);
        for(int i =0 ; i < str.length() ;i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch , hm.get(ch)+1);
            }
            else{
                hm.put(ch , 1);
            }
        }
        int ans = 0;
        for(char ch : hm.keySet()){
            ans = ans  +( (ch - '0') * hm.get(ch) );
        }
        return ans ;
    }
}