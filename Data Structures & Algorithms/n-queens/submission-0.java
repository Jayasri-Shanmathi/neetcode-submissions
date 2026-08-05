class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>sol=new ArrayList<>();
        char[][]board=new char[n][n];
        for(char[]ch:board){
            Arrays.fill(ch,'.');
        }
        bt(0,board,sol,n);
        return sol;
    }
    public static void bt(int row,char[][]board,List<List<String>>sol,int n){
        if(row==n){
            sol.add(build(board));return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                bt(row+1,board,sol,n);
                board[row][col]='.';
            }            
        }
    }
    public static boolean isSafe(int r,int c,char[][]board,int n){
        for(int i=0;i<r;i++){
            if(board[i][c]=='Q') return false;
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public static List<String> build(char[][]board){
         List<String> s=new ArrayList<>();
         for(char[]ch:board){
            s.add(new String(ch));
         }
         return s;
    }
}
