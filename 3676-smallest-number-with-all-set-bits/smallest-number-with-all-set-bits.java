class Solution {
    public int smallestNumber(int n) {
        String str = Integer.toBinaryString(n); 
        str = str.replaceAll("0", "1"); // <-- assign back to str
        return Integer.parseInt(str, 2); 
    }   
}
