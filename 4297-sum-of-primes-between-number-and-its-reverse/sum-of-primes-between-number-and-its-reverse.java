class Solution {
    public int sumOfPrimesInRange(int n)
    {
        int v = n;
        int rev = 0;
        while(v!=0)
        {
            int d = v % 10;
            rev = d + rev * 10;
            v/=10;
        }
        int st = Math.min(n,rev);
        int en = Math.max(n,rev);
        boolean arr[] = new boolean[en+1];
        for(int i=2;i<=en;i++)
        {
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;
        for(int i=2;i*i<=en;i++)
        {
            if(arr[i])
            {
                for(int j=i*i;j<=en;j+=i)
                {
                    arr[j] = false;
                }
            }
        }
        int sum = 0;
        for(int i=st;i<=en;i++)
        {
            if(arr[i])
            {
                sum+=i;
            }
        }
        return sum;
    }
}