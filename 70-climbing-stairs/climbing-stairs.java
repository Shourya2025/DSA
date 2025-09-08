// class Solution {
//     public int climbStairs(int n) {
//       int one = 0 ;
//       int two =0 ;
//       int onestep = n;
//       int twostep = n;
//       int ways = 1;
      
//       if(n ==1){
//         return 1;
//       }
//     //   while(onesteps!= 0){
//     //     onesteps--;
//     //   }  //+1
//       while(twostep%2==0){
//         twostep -= 2;
//         if(twostep == 0){
//         ways =2;
//         return 2 ;
//       }
//       }
      
//       if(twostep!= 0)  {
//         twostep--;
//         return 3;
//       }
//       return 1;
//         //-1
//     }
// }
public class Solution {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return b;
    }
}


