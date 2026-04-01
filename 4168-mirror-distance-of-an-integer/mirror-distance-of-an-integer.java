class Solution {
    public int rev(int n){
        int no =0 ;
        while(n!=0){
            int dev = n%10;
            no = no*10 + dev;
            n = n/10;
        }
        return no;
    }
    public int mirrorDistance(int n) {
        return Math.abs(rev(n) - n);
    }
}