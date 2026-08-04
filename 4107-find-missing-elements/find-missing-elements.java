class Solution {
    public List<Integer> findMissingElements(int[] nums)
    {
        Arrays.sort(nums);
        int s = nums[0];
        int l = nums[nums.length-1];
        List<Integer> li = new ArrayList<>();
        for(int n:nums)
        {
            li.add(n);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=s;i<=l;i++)
        {
            if(!li.contains(i))
            {
                res.add(i);
            }
        }
        return res;
    }
}