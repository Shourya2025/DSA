class Solution {

    public boolean Vowel(String s) {

        char ch1 = s.charAt(0);
        char ch2 = s.charAt(s.length() - 1);

        boolean first =
                ch1 == 'a' || ch1 == 'e' || ch1 == 'i' ||
                ch1 == 'o' || ch1 == 'u';

        boolean last =
                ch2 == 'a' || ch2 == 'e' || ch2 == 'i' ||
                ch2 == 'o' || ch2 == 'u';

        return first && last;
    }

    public int vowelStrings(String[] words, int left, int right) {

        int cnt = 0;

        while (left <= right) {
            if (Vowel(words[left])) {
                cnt++;
            }
            left++;
        }

        return cnt;
    }
}