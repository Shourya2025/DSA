class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder sm =  new StringBuilder(Integer.toBinaryString(n));
        for(int i = 0 ; i < sm.length() ;i++){
            if(sm.charAt(i) == '1'){
                sm.setCharAt(i , '0');
            }
            else {
                 sm.setCharAt(i , '1');
            }
        }
        return Integer.parseInt(sm.toString(), 2);
    }
}