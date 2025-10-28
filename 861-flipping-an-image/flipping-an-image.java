class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0 ; i < image.length ;i++){
            for(int j = 0 ; j < image[i].length ; j++){
                image[i][j] = image[i][j]^1; 
            }
        }


        for(int m = 0 ; m < image.length ;m++){
            for(int x = 0 ; x < image[m].length/2 ; x++){
                int temp = image[m][x];
                image[m][x] = image[m][image[m].length - x-1];
                image[m][image[m].length - x-1] = temp ;
            }
        }
        return image;
    }
}