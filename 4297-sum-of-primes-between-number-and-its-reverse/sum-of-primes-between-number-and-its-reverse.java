class Solution {
    public int reverse(int n) {
        int no = 0;
        while (n != 0) {
            int l = n % 10;
            no = no * 10 + l;
            n = n / 10;
        }
        return no;

    }

    public boolean prime(int no) {
        if (no < 2) {
            return false;
        }
        int r = no / 2;
        int fac = 0;
        int n = 2;
        while (n <= r) {
            if (no % n == 0) {
                fac++;

            }
            n++;

        }
        return fac == 0;

    }

    public int sumOfPrimesInRange(int n) {
        int first = n;
        int last = reverse(n);
        if (last < first) {
            int temp = first;
            first = last;
            last = temp;
        }
        int ans = 0;
        while (first <= last) {
            if (prime(first)) {
                ans = ans + first;
            }
            first++;

        }
        return ans;

    }
}