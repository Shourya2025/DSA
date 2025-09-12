class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        for(int i = 0 ; i < gas.length ; i++){
            totalgas += gas[i];

        }
        for(int j = 0 ; j < cost.length ; j++){
            totalcost += cost[j];
            
        }
        if(totalgas< totalcost){
            return -1;
            
        }
        int ans = 0;
        int counter = 0;
        int use =0;
        // while(counter < gas.length){
        //     use = gas[counter] - cost[counter];
        //     if(use > 0){
        //         ans = counter;
        //         use = 0;
        //         counter++;
        //     }
        //     else {
        //         use = 0;
        //         counter++;
        //     }
        // }
        for(int x  = 0 ; x < gas.length ; x++){
            use = use + gas[x] - cost[x];
            if(use<0){
               ans = x+1;
               use = 0;

            }
        }
        return ans;
    }
}