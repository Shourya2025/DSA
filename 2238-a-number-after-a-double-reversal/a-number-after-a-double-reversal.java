class Solution {
    public boolean isSameAfterReversals(int num) {
         int x = reverse(num);
        int f = reverse(x);
        return f == num;
    }
    public int reverse(int n){
        int no = 0;
        while(n!=0){
            int d = n%10;
            no = no*10 + d;
            n = n/10;
        }
        return no;
    }
}