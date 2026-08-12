class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N=cost.length;
        int total=0;
        int sum=0;
        int station=0;
        for(int i=0;i<N;i++){
             total+=gas[i]-cost[i];
             sum+=gas[i]-cost[i];
             if(sum<0){
                sum=0;
                station=i+1;
             }
        }
        if(total<0) return -1;
        return station;
    }
}
