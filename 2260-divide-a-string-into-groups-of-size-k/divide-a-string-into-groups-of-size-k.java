class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);

        // Pad the string if needed
        while (sb.length() % k != 0) {
            sb.append(fill);
        }

        int groups = sb.length() / k;
        String[] ans = new String[groups];

        for (int i = 0; i < groups; i++) {
            ans[i] = sb.substring(i * k, (i + 1) * k);
        }

        return ans;
    }
}