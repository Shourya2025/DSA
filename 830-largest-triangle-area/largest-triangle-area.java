// class Solution {
//     public double largestTriangleArea(int[][] points) {
//         double max = 0;
//         // for(int i = 0 ; i < points.length ; i++){
//             double area =0.5 ;
//             for(int j = 0 ; j < points[i].length ; j++){
//                 area = area*points[i][j];
//                 max = Math.max(area , max); 
//             }
//         }


//         return max;
//     }
// }

class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;

        // Loop through all combinations of three points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    // Get the points
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    
                    // Calculate the area using the shoelace formula
                    double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
                    
                    // Update the maximum area
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}
