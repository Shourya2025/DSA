class Solution {
    public int hammingDistance(int x, int y) {
         int xor = x^y ;
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