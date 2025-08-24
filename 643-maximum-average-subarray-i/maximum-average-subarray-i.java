class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double maxAvg = 0;//Integer.MIN_VALUE;
    double currSum = 0;
    int left = 0 ;
    for(int i = 0 ; i < k ;i++){
        currSum  += nums[i];
    } 
    maxAvg = currSum;
    for(int right = k ; right < nums.length ; right++){
        currSum += nums[right] -nums[left];
        left++;
        maxAvg = Math.max(maxAvg , currSum);
    }
    return maxAvg/k;
    }
}


// int left = 0;
//         long maxAvg = 0;//Integer.MIN_VALUE;
//         long currAvg = 0;
//         Set<Integer> st = new HashSet<>();
//         for(int right = 0 ; right< nums.length ; right++ ){
//             while(st.size() == k ){
//                 maxAvg = Math.max(maxAvg , currAvg);
//                 st.remove(nums[left]);
//                 currAvg -= nums[left] / k;
//                 left++;
//             }
//             currAvg += nums[right] /k;
//             st.add(nums[right]);
//             if(right - left +1 == k){
//                 currAvg -= nums[left] / k;
//                 left++;
//             }
//         }
//         return maxAvg;