class Solution {
    private int INF=2147483647;
    public int bfs(int i,int j,int R,int C,int[][]grid){
        int[][]dir=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        Queue<int[]>q=new LinkedList<>();
        boolean[][]vis=new boolean[R][C];
        vis[i][j]=true;
        q.add(new int[]{i,j});
        int step=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int k=0;k<size;k++){
                int[]cell=q.poll();
                if(grid[cell[0]][cell[1]]==0) return step;
                for(int a=0;a<4;a++){
                    int adjR=cell[0]+dir[a][0];
                    int adjC=cell[1]+dir[a][1];
                    if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && !vis[adjR][adjC] && grid[adjR][adjC]!=-1){
                        q.add(new int[]{adjR,adjC});
                        vis[adjR][adjC]=true;
                    }
                }
            }
            step++;
        }
        return INF;
    }

    public void islandsAndTreasure(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==INF){
                    grid[i][j]=bfs(i,j,R,C,grid);
                }
            }
        }
    }
}
