class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] interval = new int[n+1][2];
        System.arraycopy(intervals, 0 ,interval , 0 , n);
        int e = 0;
        interval[n] = newInterval;
        Arrays.sort(interval , (a , b) -> Integer.compare(a[0] , b[0]));
        int res[][] = new int[n+1][2];
        res[0] = interval[0];
        for(int i = 1 ; i <= n ;i++){
            if(interval[i][0]  <= res[e][1]){
                res[e][1] = Math.max(interval[i][1] , res[e][1]);
            }
            else {
                e++;
                res[e] = interval[i];
            }

        }
        return Arrays.copyOfRange(res , 0 , e+1);

        
        
        
        
        
            }
}



// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {
//         int n  = intervals.length;

//         int[][] interval = new int[n+1][2];
//         System.arraycopy(intervals , 0 , interval , 0 , n);
        
//         interval[n] = newInterval;
//        Arrays.sort(interval , (a,b)-> Integer.compare(a[0] , b[0]));
     
//        int[][] res = new int[n+1][2]; 
//        res[0] = interval[0];
//        int e = 0 ;
//        for(int i = 1 ; i<= n; i++){
//         if(res[e][1] >= interval[i][0]){
//             res[e][1] = Math.max( res[e][1] , interval[i][1]);
//         }
//         else {
//             e++;
//             res[e] = interval[i];
//         }
//        }
//        return Arrays.copyOfRange(res , 0 , e+1);
//     }
// }







