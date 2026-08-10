class Solution {
    public String longestPalindrome(String s) {
        int N=s.length();
        if(N==1) return s;
        if(N==2){
            if(s.charAt(0)==s.charAt(1)) return s;
            else return String.valueOf(s.charAt(0));
        }
        int start=0;int max=0; 
        int[][]dp=new int[N][N];
        for(int i=0;i<N;i++){
            dp[i][i]=1;
            start=i;max=1;
        }
        for(int i=0;i<N-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=1;
                start=i;max=2;
            }
        }
        for(int len=3;len<=N;len++){
            for(int i=0;i<=N-len;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                    dp[i][j]=1;
                    start=i;
                    max=len;

                }
            }
        }
        return s.substring(start,start+max);

    }
}
