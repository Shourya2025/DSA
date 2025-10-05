class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int num : nums){
            if(hm.containsKey(num)){
                hm.put(num , hm.get(num)+1);
            }else {
                hm.put(num , 1);
            }
        }
        int sum = 0 ;
        for(int no :hm.keySet()){
            if(hm.get(no)==1){
                sum += no ;
            }
        }
        return sum;
    }
}