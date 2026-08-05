class Solution {
    public int orangesRotting(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int oranges=0;
        Queue<int[]> q=new LinkedList<>();
        int[][]dir=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
               if(grid[i][j]==2){
                q.add(new int[]{i,j});
               }
               else if(grid[i][j]==1) oranges++;
            }
        }
        if(oranges==0) return 0;
        int days=-1;
        while(!q.isEmpty()){
            int size=q.size();
            days++;
            for(int i=0;i<size;i++){
                int[]cell=q.poll();
                for(int a=0;a<4;a++){
                    int adjR=cell[0]+dir[a][0];
                    int adjC=cell[1]+dir[a][1];
                    if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && grid[adjR][adjC]==1){
                        oranges--;
                        q.add(new int[]{adjR,adjC});
                        grid[adjR][adjC]=2;
                    }
                }
            }
        }
        if(oranges==0) return days;
        return -1;
    }
}
