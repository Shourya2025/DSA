class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = n ;
        int osum = 0;
        int even= n;
        int esum =0;
        int st =1;
        while(odd!= 0){
            if(st%2!=0){
                osum = osum+st;
                odd--;
            }
            st++;
        }
        while(even!= 0){
            if(st%2==0){
                esum = esum+st;
                even--;
            }
            st++;
        }
        return GCD(osum , esum);
    
    }
    public int GCD(int x , int y){
        
        while(x!=y){
            if(x >y){
                x = x-y;
            }
            else {
                y = y-x;
            }
            
        }
        return x;
    }
}