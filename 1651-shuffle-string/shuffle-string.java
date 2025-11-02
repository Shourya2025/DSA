class Solution {
    public String restoreString(String s, int[] indices) {
       char[] ans = new char[s.length()];
       for(int i = 0 ; i< s.length() ;i++){
        char ch = s.charAt(i);
        ans[indices[i]] = ch;
       }
       StringBuilder sm = new StringBuilder();
       for(char chr : ans ){
        sm.append(chr);
       } 
       return sm.toString();
    }
}