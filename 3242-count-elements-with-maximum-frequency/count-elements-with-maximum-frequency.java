class Solution {
    public int maxFrequencyElements(int[] nums)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x:nums)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        int mf = 0;
        for(int v:hm.values())
        {
            mf = Math.max(mf,v);
        }
        int c = 0;
        for(int m:hm.values())
        {
            if(m==mf)
            {
                c+=mf;
            }
        }
        return c;
    }
}