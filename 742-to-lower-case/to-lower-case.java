class Solution {
    public String toLowerCase(String s) {
        //return s.toLowerCase();
        StringBuilder sm = new StringBuilder(s); 
        for(int i = 0 ; i <s.length() ; i++){
            char ch = sm.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + ('a' - 'A'));
                sm.setCharAt(i , ch);
            }

        }
        return sm.toString();
    }
}