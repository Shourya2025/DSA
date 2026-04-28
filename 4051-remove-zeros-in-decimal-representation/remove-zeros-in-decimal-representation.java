class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);
        StringBuilder sm = new StringBuilder();
        for(int i = 0 ; i < s.length() ;i++){
            char ch = s.charAt(i);
            if(ch != '0'){
                sm.append(ch);
            }
        }

        return Long.parseLong(sm.toString());
    }
}