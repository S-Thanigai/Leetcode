class Solution {
    public List<Integer> majorityElement(int[] nums)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int a:nums)
        {
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        List<Integer> li = new ArrayList<>();
        int th = nums.length/3;
        for(Map.Entry<Integer,Integer> en : hm.entrySet())
        {
            int ele = en.getKey();
            int co = en.getValue();
            if(co > th)
            {
                li.add(ele);
            }
        }
        return li;
    }
}