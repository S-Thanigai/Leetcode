class Solution {
    public int findLucky(int[] arr)
    {
        int ar[] = new int[501];
        for(int a:arr)
        {
            ar[a]++;
        }
        int res = -1;
        for(int i=1;i<=500;i++)
        {
            if(ar[i]==i)
            {
                res = i;
            }
        }
        return res;
    }
}