class Solution
{
    public int missingMultiple(int[] nums, int k)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums)
        {
            hs.add(n);
        }
        int mis = 0;
        for(int i=k;k<=100;i+=k)
        {
            if(!hs.contains(i))
            {
                mis = i;
                break;
            }
        }
        return mis;
    }
}