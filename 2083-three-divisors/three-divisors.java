class Solution {
    public boolean isThree(int n) {
        int i = 1 ;
        int cnt = 1;
        while(i!=n){
            if(n%i==0){
                cnt++;
            }
            i++;
        } 
        if(cnt == 3){
            return true;
        }else {
            return false ;
        }
    }
}