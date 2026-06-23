class Solution {
   
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int sq = 0;
        int num = n ;
        while(num!=0){
            int d = num%10;
            sum += d;
            sq = sq+ (d*d);
            num  = num/10;
        }
        if(sq- sum >=50){
            return true;
        }else {
            return false ;
        }
    }
}