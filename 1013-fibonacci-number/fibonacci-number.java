class Solution {
    static int fibo(int n){
        if (n<2){
             return n ;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public int fib(int n) {
        return fibo(n);

        // int a = 0 , b= 1  , c  = 0 ;
        // if (n==0){
        //     return 0 ;
        // }
        // else if (n==1){
        //     return 1 ;
        // }
        // else {
        // for(int i = 1 ;i<n;i++ ){
        //     c= a+b;
        //     a= b ;
        //     b = c ;

        // }
        // return c ;}

    }
}