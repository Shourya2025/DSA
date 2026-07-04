import java.util.*;

class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        Set<Integer> st = new HashSet<>();

        for (int j = 0; j < nums.length; j++) {
            if (!st.contains(nums[j])) {
                int times = Math.min(hm.get(nums[j]), k);

                while (times-- > 0) {
                    ans.add(nums[j]);
                }

                st.add(nums[j]);
            }
        }

        int[] val = new int[ans.size()];
        int idx = 0;
        for (int num : ans) {
            val[idx++] = num;
        }

        return val;
    }
}