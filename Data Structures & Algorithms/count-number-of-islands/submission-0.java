class Solution {
    public static void dfs(int i,int j,int R,int C,char[][]grid){
      if(i>R || i<0 || j>C || j<0 || grid[i][j]=='0') return;
      grid[i][j]='0';
      int[][]dir=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
      for(int a=0;a<4;a++){
         int adjR=i+dir[a][0];
         int adjC=j+dir[a][1];
         if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && grid[adjR][adjC]=='1'){
            dfs(adjR,adjC,R,C,grid);
         }
      }
      
    }
    public int numIslands(char[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int count=0;
        for(int i=0;i<R;i++){
         for(int j=0;j<C;j++){
            if(grid[i][j]=='1'){
               count++;
               dfs(i,j,R,C,grid);
            }
         }
        }
        return count;
    }
}
