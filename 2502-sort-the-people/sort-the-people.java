class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0 ; i < heights.length ; i++){
            int max = getMax(i, heights.length - 1, heights);
            swap(heights, i, max, names); // swap with front
        }
        return names;
    }

    public void swap(int[] heights, int first , int second , String[] names ){
        int temp = heights[first];
        heights[first] = heights[second];
        heights[second] = temp;

        String str = names[first];
        names[first] = names[second];
        names[second] = str;
    }

    public int getMax(int start , int end , int[] heights){
        int maxIndex = start;
        for(int i = start ; i <= end ; i++){
            if(heights[i] > heights[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}


        // String[] name = new String[names.length];
        // int[] height = new int[heights.length];
        // for(int i = 0 ; i < heights.length ;i++){
        //     name[i] = names[i];
        //     height[i] = heights[i];
        // }
        // String[] ans = new String[names.length];
        // Arrays.sort(heights);
        // int k = 0 ;
        // while(k <  heights.length){
        //     int v = heights[k];
        //     for(int m = 0 ; m < heights.length ; m++){
        //         if(v == height[m]){
        //             ans[k++] = name[m];
        //             break;
        //         }
        //     }

        // }
        // return ans;