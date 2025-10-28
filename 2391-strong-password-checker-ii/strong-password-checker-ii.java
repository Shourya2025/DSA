class Solution {
    public boolean strongPasswordCheckerII(String password) {
        String str = password;
        if(str.length() < 8) return false;
         if (!password.matches(".*[a-z].*")) return false;

        // Rule 3: must contain at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) return false;

        // Rule 4: must contain at least one digit
        if (!password.matches(".*[0-9].*")) return false;

        // Rule 5: must contain at least one special character
        if (!password.matches(".*[!@#$%^&*()\\-+].*")) return false;
        for(int i = 0 ; i < str.length() -1 ;i++){
            char ch = str.charAt(i);
            char ch1 = str.charAt(i+1);
            if(ch1 == ch){
                return false;
            }

        }
        return true;
    }
}