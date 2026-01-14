class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sm = new StringBuilder();
        for(int i = 0 ; i<s.length() ;i++){
           if (s.charAt(i) == ' ') {
                k--;
                if (k == 0) {
                    break;
                }
            }
            char ch = s.charAt(i);
            
            sm.append(ch);
            
            
        }
        return sm.toString();
    }
}