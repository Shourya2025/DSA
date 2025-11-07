class Solution {
    public boolean areNumbersAscending(String s) {
        int[] ans = new int[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0; // ✅ declare num inside

                // ✅ collect the full number
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                ans[k++] = num;
                i--; // ✅ adjust because for-loop will increment i again
            }
        }

        // ✅ only check filled numbers
        for (int j = 0; j < k - 1; j++) {
            if (ans[j] >= ans[j + 1]) {
                return false;
            }
        }

        return true;
    }
}
