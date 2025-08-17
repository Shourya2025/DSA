class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k - 1 + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double W = 1.0; // sliding window sum
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = W / maxPts;
            if (i < k) {
                W += dp[i];
            } else {
                result += dp[i]; // final score in [k, n]
            }
            if (i - maxPts >= 0) {
                W -= dp[i - maxPts];
            }
        }
        return result;
    }
}
