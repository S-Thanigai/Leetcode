class Solution {
    public int minEatingSpeed(int[] piles, int h)
    {
        int l = 1;
        int r = 0;
        for(int i=0;i<piles.length;i++)
        {
            if(r < piles[i])
            {
                r = piles[i];
            }
        }
        while(l<r)
        {
            int mid = (l+r) / 2;
            if(canEat(mid,piles,h))
            {
                r = mid;
            }
            else
            {
                l =  mid+1; 
            }
        }
        return l;
    }
    public boolean canEat(int num,int arr[],int h)
    {
        int c = 0;
        for(int i=0;i<arr.length;i++)
        {
            c+=(arr[i]+num-1)/num;
            if(c>h)
            {
                return false;
            }
        }
        return c<=h;
    }
}