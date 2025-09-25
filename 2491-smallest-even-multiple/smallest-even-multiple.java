class Solution {
    public int smallestEvenMultiple(int n) {
        return (2*n)/LCM(n);
    }
    public int LCM(int n){
        int x = 2 ; 
        int y = n;
        while(x!=y){
            if(x>y){
                x =x-y;
            }else if(y>x){
                y = y -x;
            }
        }
        return y ;
    }
}