class Solution {
    public int subtractProductAndSum(int n) {
    
    int pro = 1 ;
    int sum = 0;
    while(n!=0){
        int d = n %10;
        sum = sum + d;
        pro = pro*d;
        n = n/10;
    }
    return pro - sum ;
    }
    // public int ans(int n ){
       
    //     if(n == 0){
    //         return sum ;
    //     }
    //     n = n%10;
    //     sum = sum + n;
    //     pro = pro*n;
    //     sum = pro - sum;
    //     return ans(n/10);
    // }
}