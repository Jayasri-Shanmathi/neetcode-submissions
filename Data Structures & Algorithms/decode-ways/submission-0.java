class Solution {
    public int numDecodings(String s) {
        int N=s.length();
        int[]dp=new int[N+1];
        dp[N]=1;
        for(int i=N-1;i>=0;i--){
         dp[i]=dp[i+1];
         if(s.charAt(i)=='0') {
            dp[i]=0;continue;
         }
         if(i+1<N){
            int num=(s.charAt(i)-'0')*10+s.charAt(i+1)-'0';
            if(num>=10 && num<=26) dp[i]+=dp[i+2];
         }
         
        }
        return dp[0];
    }
}
