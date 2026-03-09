class Solution {
    public int findComplement(int num) {
        StringBuilder sm = new StringBuilder(Integer.toBinaryString(num));
        for(int i = 0 ; i< sm.length() ;i++){
            if(sm.charAt(i)=='0'){
                sm.setCharAt(i,'1');
            }else {
                 sm.setCharAt(i,'0');
            }
        }
        return Integer.parseInt(sm.toString() , 2);
    }
}