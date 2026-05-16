class Solution {
    public int[] evenOddBit(int n) {
        String str  = Integer.toBinaryString(n);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(str.length() - 1 - i) == '1'){
                ans.add(i);
            }
        }
        int odd = 0 ; 
        int even = 0 ;
        for(int num : ans){
            if(num%2==0){
                even++;
            }else{
                odd++;
                }
        }
        int[] val = new int[2];
        val[0] = even;
        val[1] = odd;
        return val;
    }
}