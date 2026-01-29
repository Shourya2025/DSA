class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character , Integer> hm = new HashMap<>();
        int max = -1;
        for(int i = 0 ;i < s.length() ;i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                //hm.put(ch , hm.get(ch)+1);
                int left = i- hm.get(ch) - 1;
                max = Math.max(max , left);
            }
            else{
                hm.put(ch , i);

            }
        }
        return max;
       
    }
}