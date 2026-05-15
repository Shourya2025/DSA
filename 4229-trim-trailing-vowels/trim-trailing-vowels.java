class Solution {

    public String Trim(String str) {
        return str.substring(0, str.length() - 1);
    }

    public String trimTrailingVowels(String s) {
        String ans = s;

        while (ans.length() > 0 &&
              (ans.charAt(ans.length() - 1) == 'a' ||
               ans.charAt(ans.length() - 1) == 'e' ||
               ans.charAt(ans.length() - 1) == 'i' ||
               ans.charAt(ans.length() - 1) == 'o' ||
               ans.charAt(ans.length() - 1) == 'u')) {

            ans = Trim(ans);
        }

        return ans;
    }
}