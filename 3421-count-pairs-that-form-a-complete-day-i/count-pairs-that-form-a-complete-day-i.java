class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for(int i = 0 ; i < hours.length-1 ; i++){
            int sum = hours[i];
            for(int j = i+1 ; j <hours.length ; j++){
                if((hours[i]+hours[j])%24 == 0 ){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}