class Solution {
    public int mostFrequentEven(int[] nums)
    {
        int arr[] = new int[100001];
        for(int a:nums)
        {
            arr[a]++;
        }
        int mf = -1;
        int f = 0;
        for(int i=0;i<100001;i+=2)
        {
            if(arr[i]>f)
            {
                mf = i;
                f = arr[i];
            }
        }
        return mf;
    }
}