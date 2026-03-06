class Solution {
    public void solve(char[][] board)
    {
        int m = board.length;
        int n = board[0].length;
        for(int j=0;j<n;j++) dfs(board,0,j);
        for(int j=0;j<n;j++) dfs(board,m-1,j);
        for(int i=0;i<m;i++) dfs(board,i,0);
        for(int i=0;i<m;i++) dfs(board,i,n-1);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j] = 'X';
                }
                else if(board[i][j]=='S')
                {
                    board[i][j] = 'O';
                }
            }
        }
    }
    public void dfs(char board[][],int r,int c)
    {
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!='O')
        {
            return;
        }
        board[r][c] = 'S';
        dfs(board,r+1,c);
        dfs(board,r-1,c);
        dfs(board,r,c+1);
        dfs(board,r,c-1);
    }
}