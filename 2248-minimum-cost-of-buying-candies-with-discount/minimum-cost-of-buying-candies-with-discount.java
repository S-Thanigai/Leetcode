class Solution {
    public int minimumCost(int[] cost)
    {
        Arrays.sort(cost);
        int n = cost.length;
        int co = 0;
        for(int i=n-1;i>=0;i-=3)
        {
            co+=cost[i];
            if(i-1 >= 0)
            {
                co+=cost[i-1];
            }
        }
        return co;   
    }
}