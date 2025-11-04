class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int l = 0 , r =0;
        Arrays.sort(players);
        Arrays.sort(trainers);
       while(l<players.length && r< trainers.length){
        if(trainers[r]>=players[l]){
            l++;
        }
        r++;
       }
       return l;
    }
}