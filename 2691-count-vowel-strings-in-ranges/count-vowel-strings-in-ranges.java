class Solution {

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            boolean v = isValid(words[i].charAt(0), words[i].charAt(words[i].length() - 1));
            if (v) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }
        int[] pre = new int[ans.length];
        int ans4 = 0;
        for (int j = 0; j < ans.length; j++) {
            ans4 += ans[j];
            pre[j] = ans4;
        }

        int[] ret = new int[queries.length];

        for (int k = 0; k < queries.length; k++) {
            int l = queries[k][0];
            int r = queries[k][1];

            if (l == 0) {
                ret[k] = pre[r];
            } else {
                ret[k] = pre[r] - pre[l - 1];
            }
        }
        return ret;

    }

    public boolean isValid(Character ch1, Character ch2) {
        boolean ans1 = false;
        if (ch1 == 'a' || ch1 == 'e' || ch1 == 'o' || ch1 == 'i' || ch1 == 'u') {
            ans1 = true;
        }
        boolean ans2 = false;
        if (ch2 == 'a' || ch2 == 'e' || ch2 == 'o' || ch2 == 'i' || ch2 == 'u') {
            ans2 = true;
        }
        return ans1 && ans2;
    }
}