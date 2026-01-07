class Solution {
    public int thirdMax(int[] nums)
    {
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        if(s.size() < 3)
        {
            return Collections.max(s);
        }
        List<Integer> li = new ArrayList<>(s);
        Collections.sort(li, Collections.reverseOrder());
        return li.get(2);
    }    
}