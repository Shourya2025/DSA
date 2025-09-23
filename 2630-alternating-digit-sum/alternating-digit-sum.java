class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.clear();
        digits(ans , n);
        int pos = 0 ; 
        int neg = 0 ;

        for(int i = 0 ; i < ans.size() ; i++){
            if(i%2==0){
                pos += ans.get(i); 
            }
            else{
                neg += ans.get(i);
            }
        }
        return pos - neg ;
    }
    public void digits(ArrayList<Integer> ans, int n) {
	if(n== 0) {
		return ;
	}
	digits(ans , n/10);
	ans.add(n%10);
	}
}