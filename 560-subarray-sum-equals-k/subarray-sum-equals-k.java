class Solution {
    public int subarraySum(int[] nums, int k)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sp = 0;
        int c = 0;
        hm.put(0,1);
        for(int i:nums)
        {
            sp+=i;
            if(hm.containsKey(sp-k))
            {
                c += hm.get(sp-k);
            }
            hm.put(sp,hm.getOrDefault(sp,0)+1);
        }
        return c;
    }
}