class Solution {
    public boolean checkDivisibility(int n) {
        return n % (sum(n) + product(n)) == 0;
    }
    public int sum(int n){
        int x = n;
        int sum = 0;
        while(x!=0){
            int d = x%10;
            sum += d;
            x = x/10;
        }
        return sum ;
    }
    public int product(int n){
        int p = n;
        int pro =1 ;
        while(p!=0){
            int d = p%10;
            pro = pro*d;
            p = p/10;
        }
        return pro;
    }
}