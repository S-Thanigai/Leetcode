class Solution {
    public int digitFrequencyScore(int n)
    {
        int arr[] = new int[10];
        while(n!=0)
        {
            int v = n%10;
            arr[v]++;
            n/=10;
        }
        int sum = 0;
        for(int i=0;i<10;i++)
        {
            sum+=i*arr[i];
        }
        return sum;
    }
}