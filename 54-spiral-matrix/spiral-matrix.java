class Solution {
    public List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> res = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int x = 0;
        int y = 0;
        int dx = 1;
        int dy = 0;
        for(int i=0;i<r*c;i++)
        {
            res.add(matrix[y][x]);
            matrix[y][x] = -101;
            if(!(0<=x+dx && x+dx<c && 0<=y+dy && y+dy<r) || matrix[y+dy][x+dx]==-101)
            {
                int t = dx;
                dx = -dy;
                dy = t;
            }
            x+=dx;
            y+=dy;
        }
        return res;
    }
}