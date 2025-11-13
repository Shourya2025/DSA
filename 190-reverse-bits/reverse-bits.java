class Solution {
    public int reverseBits(int n) {
        String str = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sm = new StringBuilder(str);
        sm.reverse();
        String ans = sm.toString();
        return (int)Long.parseLong(ans , 2);
    }
}