class Solution {
    public int[] findErrorNums(int[] nums)
    {
        int n = nums.length;
        int arr[] = new int[n+1];
        for(int nu:nums)
        {
            arr[nu]++;
        }
        int du = -1;
        int mi = -1;
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==2)
            {
                du=i;
            }
            else if(arr[i]==0)
            {
                mi=i;
            }
        }
        return new int[]{du,mi};
    }
}