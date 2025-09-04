class Solution {
    public int findClosest(int x, int y, int z) {
        int ysteps = 0;
       if(y>z){
         while(z!=y){
            y--;
            ysteps++;
        }
       }
       else {
        while(z!=y){
            y++;
            ysteps++;
        }

       }
        int xsteps = 0;
      if(x<z){
          while(z!=x){
            x++;
            xsteps++;
        }
      }
      else {
        while(z!=x){
            x--;
            xsteps++;
        }
      }
        if(xsteps == ysteps){
            return 0 ;
        }
        else if(xsteps<ysteps){
            return 1;
        }
        else{
            return 2;
        }
    }
}