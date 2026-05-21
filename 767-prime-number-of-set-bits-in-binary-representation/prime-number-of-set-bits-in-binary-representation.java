class Solution {
    public boolean isPrime(int n){
        int fac = 0;
        if(n == 0 || n ==1 ){
            return false ;
        }
        if(n == 2 || n ==3 ){
            return true;
        }else {
            int i = 2;
            while(i <= n-1){
                if(n%i == 0){
                    fac++;
                }
                i++;
            }

        }
        return fac == 0;
    }
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        while(left<= right){
            int n = Integer.bitCount(left);
            if(isPrime(n)){
                cnt++;
            }
            left++;
        }
        return cnt ;
    }

}