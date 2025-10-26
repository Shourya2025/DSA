class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < numRows ;i++){
            ans.add(row(i));
        }
        return ans;

    }
    public List<Integer> row(int row){
        long ans = 1;
        
        List<Integer> ls = new ArrayList<>();
        ls.add((int)ans);
        for(int i =1 ; i <= row ; i++){
            ans = ans * (row -i +1);
            ans = ans /i;
            ls.add((int)ans);
        }
        return ls;
    }
}