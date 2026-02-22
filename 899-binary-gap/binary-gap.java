class Solution {
    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int max = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch == '1') {
                int z = 0;
                for (int j = i + 1; j < str.length(); j++) {
                    char ch2 = str.charAt(j);
                    if(ch2 == '1' && z == 0){
                        z++;
                        max = Math.max(max , Math.abs(i-j));
                    }
                   
                }
            }

        }

        return max;
    }
}