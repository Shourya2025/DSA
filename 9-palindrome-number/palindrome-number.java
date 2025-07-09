class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0){
        //     return false;

        // }
        // int n = x ;
        // int Revno = 0 ;
        // while(n>0){
        //     int d = n%10;
        //     Revno = Revno*10 + d ;
        //     n = n/10;


        // }
        // if(Revno == x ){
        //     return true ;
        // }
        // else return false ;
        if(x < 0){
            return false ;
        }

        int n  = x ;
        int rev = 0 ;
        int d ; 
        while(n> 0){
            d = n%10;
            rev = rev*10 + d;
            n = n/10; 
        }
        if(rev== x){
            return  true 
            ;
        }
        else {
            return false ;
        }

    }
}