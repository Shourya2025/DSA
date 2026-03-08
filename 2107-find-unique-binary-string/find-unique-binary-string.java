class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder sm = new StringBuilder();
        for(int i = 0 ; i< n ; i++){
            char flip = nums[i].charAt(i)=='0'?'1': '0';
            sm.append(flip);
        }
        return sm.toString();
    }
}