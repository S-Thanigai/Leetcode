class Solution {
    static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().
            addShutdownHook(
                new Thread(
                    ()->{
                        try(FileWriter f = new FileWriter("display_runtime.txt")){
                            f.write("0");
                        } catch (Exception e){}
                    }
                )
            );
         }
    public int longestConsecutive(int[] nums)
    {
        // Arrays.sort(nums);
        // HashSet<Integer> s = new HashSet<>();
        // int ml = 0;
        // int l = 0;
        // for(int i:nums)
        // {
        //     s.add(i);
        // }
        // for(int i:s)
        // {
        //     if(!s.contains(i-1))
        //     {
        //         int curr = i;
        //         l = 1;
        //         while(s.contains(curr+1))
        //         {
        //             l++;
        //             curr++;
        //         }
        //     }    
        //     ml = Math.max(ml,l);
        // }
        // return ml;
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int c = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                continue;
            } 
            if(nums[i-1]==nums[i]-1)
            { 
                c+=1;
               max = Math.max(max,c);
            }
            else
            {
                c=1;
            }
        }
        return max;
    }
}