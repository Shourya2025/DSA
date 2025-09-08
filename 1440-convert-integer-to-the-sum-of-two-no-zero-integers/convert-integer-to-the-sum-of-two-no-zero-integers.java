class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        int a = 0;
        int b = 0;
        while (a <= n) {
            b = n - a;

            if (!containZero(a) && !containZero(b) && a != 0 && b != 0 && a + b == n) {
                ans[0] = a;
                ans[1] = b;
                return ans;
            }
            a++;
        }
        return ans;
    }

    boolean containZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}