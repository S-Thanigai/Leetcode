class Solution {
    public int[] limitOccurrences(int[] nums, int k)
    {
        List<Integer> li = new ArrayList<>();
        int res[] = new int[101];
        for(int i=0;i<nums.length;i++)
        {
            res[nums[i]]++;
        }
        int c = 0;
        for(int i=0;i<101;i++)
        {
            if(res[i]<=k)
            {
                for(int j=1;j<=res[i];j++)
                {
                    li.add(i);
                }
            }
            else
            {
                for(int j=1;j<=k;j++)
                {
                    li.add(i);
                }
            }
        }
        int[] arr = li.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return arr;        
    }
}