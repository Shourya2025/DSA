class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr =  new ArrayList<>();
        for(int i = 0 ; i < nums.length ;i++){
            arr.add(index[i] , nums[i]);
        }
        int[] target = new int[arr.size()];
        for(int j = 0 ; j < nums.length ;j++){
            target[j] = arr.get(j);
        }
        return target;
    }
}