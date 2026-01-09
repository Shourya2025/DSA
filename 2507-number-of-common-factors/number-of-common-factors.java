class Solution {
    public int commonFactors(int a, int b) {
        int no = 0;
        int st =1;
        int min = Math.min(a , b);
        while(st <= min){
            if(a%st == 0 && b %st ==0){
                no++;
            }
            st++;
        }
        return no;
    }
}