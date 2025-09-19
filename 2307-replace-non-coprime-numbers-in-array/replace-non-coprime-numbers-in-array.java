// import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        // Iterate through the nums array
        for (int num : nums) {
            st.push(num);
            // Merge non-coprime numbers
            while (st.size() > 1) {
                int second = st.pop();
                int first = st.peek();
                int gcd = GCD(first, second);

                if (gcd == 1) {
                    st.push(second);  // Push the second number back if they are coprime
                    break;  // Exit the loop as we've found coprime numbers
                } else {
                    int lcm = LCM(first, second);
                    st.pop();  // Remove the first number as it's merged with the second
                    st.push(lcm);  // Push the LCM back to the stack
                }
            }
        }

        // Collect the result from the stack
        while (!st.empty()) {
            ans.add(st.pop());
        }
        Collections.reverse(ans);  // Reverse the list to maintain the original order
        return ans;
    }

    // Optimized Euclidean algorithm for GCD
    public int GCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // LCM formula
    public int LCM(int x, int y) {
        return (x / GCD(x, y)) * y;  // Avoid overflow by dividing first
    }
}
