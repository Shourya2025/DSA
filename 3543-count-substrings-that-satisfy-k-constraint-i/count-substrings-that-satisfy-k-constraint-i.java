class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int cnt = 0;
        for(int i  = 0 ; i < s.length() ; i++){
            int zcnt = 0;
            int ocnt = 0;
            for(int j = i ; j < s.length() ; j++){
                char ch = s.charAt(j);
                if(ch == '0' ){
                    zcnt++;
                }else{
                    ocnt++;
                }
                
                if(zcnt <= k || ocnt<= k){
                    cnt++;
                }
            }
        }
        return cnt ;
    }
}