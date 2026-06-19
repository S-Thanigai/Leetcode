class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target)
    {
        List<List<Integer>> res  = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len-3;i++)
        {
            if(i>0 && nums[i-1]==nums[i])
            {
                continue;
            }
            for(int j=i+1;j<len-2;j++)
            {
                if(j>i+1 && nums[j-1]==nums[j])
                {
                    continue;
                }
                int l = j+1;
                int r = len - 1;
                while(l<r)
                {
                    List<Integer> li = new ArrayList<>();
                    long s = (long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(s==target)
                    {
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[l]);
                        li.add(nums[r]);
                        res.add(li);
                        while(l < r && nums[l] == nums[l + 1]) l++;
                        while(l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    }
                    else if(s<target)
                    {
                        l++;
                    }
                    else
                    {
                        r--;
                    }
                }
            }
        }
        return res;
    }
}