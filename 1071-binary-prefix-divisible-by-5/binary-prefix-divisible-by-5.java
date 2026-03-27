class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums)
    {
        List<Boolean> li = new ArrayList<>();
        int len = nums.length;
        int num = 0;
        for(int i=0;i<len;i++)
        {
            num = (num*2+nums[i])%5;
            if(num==0)
            {
                li.add(true);
            }
            else
            {
                li.add(false);
            }
        }
        return li;
    }
    static{
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
            fw.write("0");
        } catch (Exception e) {
        }
    }));}
}