// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int[] odd = new int[nums.length];
//         int[] even = new int[nums.length];
//         int[] ans = new int[nums.length];
//         int i = 0 ;//odd
//          int j =0;//even
//         for(int k = 0 ; k < nums.length ;k++){
//             if(nums[k]%2==0){
//                 even[i++] = nums[k];
//             }
//             else {
//               odd[j++] = nums[k];  
//             }
//         }
//         int m = 0 ;
//         for(int x = 0 ; x < even.length/2 ; x++){
//             ans[m++] = even[x];
//         }
//         for(int y = 0 ; y < odd.length/2 ; y++){
//             ans[m++] = odd[y];
//         }
//         return ans ;
//     }
// }
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] odd = new int[nums.length];
        int[] even = new int[nums.length];
        int[] ans = new int[nums.length];
        int i = 0; // even index
        int j = 0; // odd index

        // Separate even and odd
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] % 2 == 0) {
                even[i++] = nums[k];
            } else {
                odd[j++] = nums[k];
            }
        }

        int m = 0;
        // Copy only the filled even numbers
        for (int x = 0; x < i; x++) {
            ans[m++] = even[x];
        }
        // Copy only the filled odd numbers
        for (int y = 0; y < j; y++) {
            ans[m++] = odd[y];
        }

        return ans;
    }
}
