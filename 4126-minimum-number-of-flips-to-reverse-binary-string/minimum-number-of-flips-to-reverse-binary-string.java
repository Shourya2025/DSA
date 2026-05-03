class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sm = new StringBuilder(s);
        String new1 = sm.reverse().toString();
        int cnt = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch1 = s.charAt(i);
            char ch2 = new1.charAt(i);
            if(ch1 != ch2){
                cnt++;
            }
        }
        return cnt ;
    }
}