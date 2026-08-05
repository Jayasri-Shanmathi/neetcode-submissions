class Solution {
   public int dfs(int i,int j,int R,int C,int[][]grid,int[][]dp){
      if(i<0 || i>=R || j<0 || j>=C) return Integer.MAX_VALUE;
      if(i==R-1 && j==C-1) return grid[i][j];
      if(dp[i][j]!=-1) return dp[i][j];
      int right=dfs(i,j+1,R,C,grid,dp);
      int down=dfs(i+1,j,R,C,grid,dp);
      dp[i][j]=grid[i][j]+Math.min(right,down);
      return dp[i][j];
   } 
   public int minPathSum(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int[][]dp=new int[R][C];
        for(int[]a:dp){
         Arrays.fill(a,-1);
        }
        return dfs(0,0,R,C,grid,dp);
        
    }
}