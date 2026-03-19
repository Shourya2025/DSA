class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.split(" "); 
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < str.length ;i++){
            StringBuilder sm = new StringBuilder(str[i]);
            ans.append(sm.reverse().append(" "));
        }
        return ans.toString().trim();
    }
}