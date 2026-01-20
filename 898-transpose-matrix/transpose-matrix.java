class Solution {
    public int[][] transpose(int[][] matrix)
    {
        int c = matrix.length;
        int r = matrix[0].length;
        int trans[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }
}