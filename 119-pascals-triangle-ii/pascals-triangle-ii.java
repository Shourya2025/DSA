class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls  = new ArrayList<>();
        long ans =1;
        ls.add((int)ans);
        for(int i = 1 ; i <=rowIndex ; i++){
            ans = ans *(rowIndex - i +1);
            ans = ans / i;
            ls.add((int)ans);
        }
        return ls;
    }
}