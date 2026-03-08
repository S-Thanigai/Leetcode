class Solution {
    public int singleNumber(int[] nums)
    {
        /*int r = 0;
        for(int n:nums)
        {
            r^=n;
        }
        return r;*/
        int n = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums)
        {
            if(hs.contains(i))
            {
                hs.remove(i);
            }
            else
            {
                hs.add(i);
            }
        }
        return hs.iterator().next();
    }
}