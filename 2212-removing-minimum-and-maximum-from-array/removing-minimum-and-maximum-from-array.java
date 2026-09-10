class Solution
{
    public int minimumDeletions(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int a:nums)
        {
            min = Math.min(min,a);
            max = Math.max(max,a);
        }
        return Math.min(fdele(nums,min,max),Math.min(ldele(nums,min,max),obol(nums,min,max)));
    }
    public static int fdele(int nums[],int min,int max)
    {
        boolean mif = false;
        boolean maf = false;
        int fc = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max)
            {
                maf=true;
            }
            if(nums[i]==min)
            {
                mif=true;
            }
            if(maf && mif)
            {
                fc=i+1;
                break;
            }
        }
        return fc;
    }
    public static int ldele(int nums[],int min,int max)
    {
        boolean mif = false;
        boolean maf = false;
        int fc = 0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==max)
            {
                maf=true;
            }
            if(nums[i]==min)
            {
                mif=true;
            }
            fc+=1;
            if(maf && mif)
            {
                break;
            }
        }
        return fc;
    }
    public static int obol(int nums[],int max,int min)
    {
        int c = 0;
        int fc = 0;
        int lc = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max || nums[i]==min)
            {
                fc+=1;
                break;
            }
            fc+=1;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            lc+=1;
            if(nums[i]==max || nums[i]==min)
            {
                break;
            }
        }
        c = fc + lc;
        return c;
    }
}