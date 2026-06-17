class Solution {
    public int countDistinctIntegers(int[] nums)
    {
        int arr[] = new int[1000001];
        for(int n:nums)
        {
            arr[n]++;
            arr[reverse(n)]++;
        }
        int c = 0;
        for(int i=1;i<1000001;i++)
        {
            if(arr[i]>0)
            {
                c+=1;
            }
        }
        return c;
    }
    public int reverse(int n)
    {
        int rev = 0;
        while(n!=0)
        {
            int v = n%10;
            rev = v + rev * 10;
            n/=10;
        }
        return rev;
    }
}