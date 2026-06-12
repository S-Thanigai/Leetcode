class Solution {
    public int diagonalSum(int[][] mat)
    {
        int i = 0;
        int j = 0;
        int s = 0;;
        while(i<mat.length)
        {
            s+=mat[i++][j++];
        }
        i=0;
        j--;
        while(i<mat.length)
        {
            if(i!=j)
            {
                s+=mat[i++][j--];
            }
            else
            {
                i++;
                j--;
            }
        }
        return s;
    }
}