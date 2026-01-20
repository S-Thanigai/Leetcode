class Solution {
    public void setZeroes(int[][] matrix)
    {
        int r = matrix.length;
        int c = matrix[0].length;
        int ro[] = new int[r];
        int co[] = new int[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    ro[i]=1;
                    co[j]=1;
                }    
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(ro[i]==1 || co[j]==1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}