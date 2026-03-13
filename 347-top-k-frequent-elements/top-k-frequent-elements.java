class Solution {
    public int[] topKFrequent(int[] nums, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // List<Integer> li = new ArrayList<>(map.keySet());
        // li.sort((a,b) -> map.get(b) - map.get(a));
        // int arr[] = new int[k];
        // for(int i=0;i<k;i++)
        // {
        //     arr[i] = li.get(i);
        // } 
        // return arr;
        List<Integer>[] li = new ArrayList[nums.length+1];
        for(int ke:map.keySet())
        {
            int f = map.get(ke);
            if(li[f]==null)
            {
                li[f] = new ArrayList<>();
            }
            li[f].add(ke);
        }
        int res[] = new int[k];
        int id = 0;
        for(int i=li.length-1;i>=0 && id<k;i--)
        {
            if(li[i]!=null)
            {
                for(int a:li[i])
                {
                    res[id++] = a;
                    if(id==k)
                    {
                        break;
                    }
                }
            }
        }
        return res;
    }
}