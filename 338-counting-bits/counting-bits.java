class Solution {
    public int cnt(int n){
        String val = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i = 0 ; i < val.length() ; i++){
            if(val.charAt(i) == '1'){
                cnt++;
            }
        }
        return cnt;
    }
    public int[] countBits(int n) {
       int[] ans = new int[n+1];
       int k = 0 ;
       for(int i = 0 ; i <=n ;i++){
        ans[k++] = cnt(i);
       }
    return ans;
        
    }
}