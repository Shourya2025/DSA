// class Solution {
//     public boolean canPlaceFlowers(int[] flowerbed, int n) {
//         if(flowerbed.length == 0){
//             return false ;
//         }
//         for(int i = 0 ; i < flowerbed.length  ; i++ ){
            
//             if(flowerbed.length ==1){
//                 if(flowerbed[0] == 0){
//                     flowerbed[0]=1;
//                     n--;
//                 }
//             }
//             else if(flowerbed.length == 2){
//                 if(flowerbed[0] == 0 && flowerbed[1] == 0){
//                     n--;
//                 }
//             }
//             // if(flowerbed[i] != 1 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1){
//             //     flowerbed[i] = 1;
//             //     n--;
//             // }
//             if (flowerbed[i] == 0 &&
//                 (i == 0 || flowerbed[i - 1] == 0) &&  // check left
//                 (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) { 
//                      flowerbed[i] = 1;
//                n--;
//         }
//         }

//         if(n == 0){
//             return true ;
//         }
//         else {
//             return false ;
//         }
//     }
// }
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                
                flowerbed[i] = 1;
                n--;

                if (n == 0) {
                    return true;
                }
            }
        }

        return n <= 0;
    }
}
