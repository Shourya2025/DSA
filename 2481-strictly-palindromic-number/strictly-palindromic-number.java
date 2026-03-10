class Solution {
    public boolean isStrictlyPalindromic(int n) {

        int no = 2;

        while (no <= n - 2) {

            String s = Integer.toString(n, no);

            StringBuilder sb = new StringBuilder(s);

            if (!s.equals(sb.reverse().toString())) {
                return false;
            }

            no++;
        }

        return true;
    }
}