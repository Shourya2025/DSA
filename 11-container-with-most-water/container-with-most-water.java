class Solution {
    public int maxArea(int[] height) {
        int start = 0 ;
        int end = height.length -1;
        int max = 0;
        while(start < end){
            int width = Math.abs(start - end);
            int currheight = Math.min(height[start] ,height[end]);
            int currcap = currheight*width;
            max = Math.max(currcap , max);
            if(height[start] < height[end]){
                start ++;
            }else{
                end--;
            }
        }
        return max;
       
    }

}
// int start = 0 ;
// int end = height.length -1 ;
// int maxCap = 0;
// while(start < end ){
//     int width = end - start ;
//     int minHeight = Math.min(height[start] , height[end]);
//     int currCap = width*minHeight ;
//      maxCap = Math.max(maxCap,currCap);
//     if(height[start] < height[end]){
//         start++;

//     }
//     else {
//         end--;
//     }

//      }
//      return maxCap;

// }











//  int start = 0 ;
//         int end = height.length -1;
//         int maxCapp= 0;
//         while(start < end ){
//             int width = end - start ;
//             int minheight = Math.min(height[start] ,height[end]);
//             int area = minheight*width;
//             maxCapp = Math.max(area , maxCapp);
//             if(height[start] < height[end]){
//                 start ++;
//             }
//             else {
//                 end--;
//             }

//         }
//         return maxCapp;



