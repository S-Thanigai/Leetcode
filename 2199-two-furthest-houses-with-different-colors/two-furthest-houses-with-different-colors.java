class Solution {
    public int maxDistance(int[] colors)
    {
        int len = colors.length;
        int l = 0;
        int r = 0;
        for(int i=0;i<len;i++)
        {
            if(colors[i]!=colors[len-1])
            {
                l=i;
                break;
            }
        }
        for(int i=len-1;i>=0;i--)
        {
            if(colors[i]!=colors[0])
            {
                r=i;
                break;
            }
        }
        return Math.max(len - 1 - l,r);
    }
}