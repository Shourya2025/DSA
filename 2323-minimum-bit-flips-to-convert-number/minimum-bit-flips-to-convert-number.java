class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start^goal ;
        int cnt =0;
        String xr = Integer.toBinaryString(xor);
        for(int i = 0 ; i < xr.length() ;i++){
            char ch = xr.charAt(i);
            if(ch == '1'){
                cnt++;
            }
        }
        return cnt;
    }
}