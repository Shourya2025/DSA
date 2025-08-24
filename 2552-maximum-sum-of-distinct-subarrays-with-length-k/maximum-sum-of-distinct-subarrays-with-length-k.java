class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set st = new HashSet<>();
        int left = 0;
        long currSum = 0 ; long maxSum = 0;
        for(int right = 0 ; right < nums.length ; right++){
            while(st.contains(nums[right]) || st.size()==k){
                currSum -= nums[left];
                st.remove(nums[left]);
                left++;
            }
            currSum+= nums[right];
            st.add(nums[right]);
            
            if(right - left + 1 == k){
                maxSum = Math.max(currSum , maxSum);
                currSum -= nums[left];
                st.remove(nums[left]);
                left++;
            }
        }
        return maxSum ;
    }
}





// import java.util.*;

// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         Set<Integer> set = new HashSet<>();
//         int left = 0;
//         long currSum = 0, maxSum = 0;

//         for (int right = 0; right < nums.length; right++) {
//             // While we have duplicates, move left pointer
//             while (set.contains(nums[right])) {
//                 set.remove(nums[left]);
//                 currSum -= nums[left];
//                 left++;
//             }

//             // Add the current element
//             set.add(nums[right]);
//             currSum += nums[right];

//             // Check if window size is exactly k
//             if (right - left + 1 == k) {
//                 maxSum = Math.max(maxSum, currSum);
//                 // Slide window forward
//                 set.remove(nums[left]);
//                 currSum -= nums[left];
//                 left++;
//             }
//         }

//         return maxSum;
//     }
// }
