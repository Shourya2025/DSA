import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Special case for k == 0
        if (k == 0) {
            // Just check if there exists a subarray whose sum is 0 with at least two elements
            int presum = 0;
            for (int i = 0; i < nums.length; i++) {
                presum += nums[i];
                if (presum == 0 && i >= 1) {
                    return true;
                }
            }
            return false;
        }
        
        Map<Integer, Integer> hm = new HashMap<>();
        int presum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            presum += nums[i];
            int rem = presum % k;
            
            if (rem == 0 && i >= 1) {
                return true;
            }
            
            if (hm.containsKey(rem)) {
                int idx = hm.get(rem);
                if (i - idx >= 2) {
                    return true;
                }
            } else {
                hm.put(rem, i);
            }
        }
        
        return false;
    }
}
