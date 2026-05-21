class Solution {
    static int[] dp;
    public  int fibo(int n){
        if(n == 1 || n == 0){
            return n ;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int ans = fibo(n-1) + fibo(n-2);
        dp[n] = ans;
        return ans;
    }
    public int fib(int n) {
        dp = new int[n+1];
        return fibo(n);

    }
}







//   The Ultimate base code - naive approach 

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




//      The Rescursion approach 
// static int fibo(int n){
//         if (n<2){
//              return n ;
//         }
//         return fibo(n-1) + fibo(n-2);
//     }
//     public int fib(int n) {
//         return fibo(n);

//     } 
