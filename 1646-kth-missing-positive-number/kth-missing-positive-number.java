class Solution {
    public int findKthPositive(int[] arr, int k)
    {
        int res[] = new int[10001];
        for(int i=0;i<arr.length;i++)
        {
            res[arr[i]]++;
        }
        int c = 0;
        for(int i=1;i<=10000;i++)
        {
            if(res[i]<1)
            {
                c+=1;
            }
            if(c==k)
            {
                return i;
            }
        }
        return -1;
    }
}