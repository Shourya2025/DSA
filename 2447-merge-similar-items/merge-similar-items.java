class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < items1.length ; i++){
            if(hm.containsKey(items1[i][0])){
                hm.put(items1[i][0] , hm.get(items1[i][0])+items1[i][1]);
            }else{
                hm.put(items1[i][0] , items1[i][1]);
            }
        }
         for(int j = 0 ; j < items2.length ; j++){
            if(hm.containsKey(items2[j][0])){
                hm.put(items2[j][0] , hm.get(items2[j][0])+items2[j][1]);
            }else{
                hm.put(items2[j][0] , items2[j][1]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int num : hm.keySet()){
            List<Integer> ans1 =  new ArrayList<>();
            ans1.add(num);
            ans1.add(hm.get(num));
            ans.add(ans1);        
        }
        Collections.sort(ans, (a, b) -> a.get(0) - b.get(0));
        return ans;
    }
}