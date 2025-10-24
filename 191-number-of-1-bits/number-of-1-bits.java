class Solution {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i =0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == '1'){
                cnt++;
            }
        }
        return cnt;
    }
}