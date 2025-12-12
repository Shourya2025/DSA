class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        while (left <= right) {
            boolean ny = number(left);
            if (ny == true) {
                ans.add(left);
            }
            left++;
        }
        return ans;
    }

    public boolean number(int no) {
        int num = no;
        while (num != 0) {
            int x = num % 10;

            if (x == 0) return false;       // FIX 1: avoid divide by zero
            if (no % x != 0) return false;  // FIX 2: must divide fully

            num = num / 10;
        }
        return true;
    }
}
