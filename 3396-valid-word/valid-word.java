class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        if (!word.matches("[0-9A-Za-z]+")) return false;  // Only alphanumeric

        if (!word.matches(".*[AEIOUaeiou].*")) return false; // Must contain at least one vowel

        if (!word.matches(".*[A-Za-z&&[^AEIOUaeiou]].*")) return false; // Must contain at least one consonant

        return true;
    }
}
