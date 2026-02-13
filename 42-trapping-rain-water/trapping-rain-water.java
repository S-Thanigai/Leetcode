class Solution {
    public int trap(int[] height)
    {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int ml = height[l];
        int rl = height[r];
        int w = 0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(ml > height[l+1])
                {
                    w+=ml-height[l+1];
                }
                l+=1;
                ml = Math.max(ml,height[l]);
            }
            else
            {
                if(rl > height[r-1])
                {
                    w+=rl-height[r-1];
                }
                r-=1;
                rl = Math.max(rl,height[r]);
            }
        }
        return w;
    }
}