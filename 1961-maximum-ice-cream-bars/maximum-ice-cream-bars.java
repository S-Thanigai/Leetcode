class Solution {
    public int maxIceCream(int[] costs, int coins)
    {
        int c = 0;
        Arrays.sort(costs);
        for(int co:costs)
        {
            if(co>coins)
            {
                break;
            }
            coins-=co;
            c+=1;
        }
        return c;
    }
}