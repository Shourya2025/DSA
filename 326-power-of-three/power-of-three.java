class Solution {
    // public boolean isPowerOfThree(int n) {
    //     return divByThree(n);
    // }

    // boolean divByThree(int n) {
    //     if (n == 1) return true;       // base case
    //     if (n <= 0 || n % 3 != 0) return false;
    //     return divByThree(n / 3);
    // }
    public boolean isPowerOfThree(int n) {
   if(n<=0) return false ;
   while(n%3 ==0){
    n = n/3;

   }
   return n==1;
   }
    
}
