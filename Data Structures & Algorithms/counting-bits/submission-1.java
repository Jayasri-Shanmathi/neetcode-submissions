class Solution {
    public int[] countBits(int n) {
        int[]arr=new int[n+1];
        int p=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<31;j++){
                if((i & 1<<j) !=0)arr[i]++;
            }
        }
        return arr;
    }
}
