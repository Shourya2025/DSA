class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){return false;}
        String shift = s+s; // shift means continouing
        return shift.contains(goal);
    }
}