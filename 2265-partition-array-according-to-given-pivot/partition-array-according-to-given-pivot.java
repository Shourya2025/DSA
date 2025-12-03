class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // int[] left = new int[nums.length];
        // int[] right = new int[nums.length];
        // List<Integer> ans = new ArrayList<>();
        // int l = 0 ;
        // int r =0 ;
        // for(int i = 0 ; i < nums.length ;i++){
        //     if(nums[i] < pivot){
        //         left[l++] = nums[i];
        //     }
        //     else{
        //         right[r++] = nums[i];
        //     }
        // }
        // for(int num : left){
        //     ans.add(num);
        // }
        // ans.add(pivot);
        // for(int num : right){
        //     ans.add(num);
        // }
        // int[] res = new int[ans.size()];
        // int m = 0 ;
        // for(int h = 0 ; h < ans.size() ; h++){
        //     res[m++] = ans.get(h);
        // }
        // return res;
        List<Integer> ans = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int cnt = 0;
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] < pivot){
                left.add(nums[i]);
            }
            else if(nums[i] > pivot){
                right.add(nums[i]);
            }
            if(nums[i] == pivot){
                cnt++;
            }
        }
        for(int num : left){
            ans.add(num);
        }
        while(cnt != 0){
        ans.add(pivot);
        cnt--;
        }
        for(int num : right){
            ans.add(num);
        }
        int[] res = new int[ans.size()];
        int m = 0 ;
        for(int h = 0 ; h < ans.size() ; h++){
            res[m++] = ans.get(h);
        }
        return res;


    }
}