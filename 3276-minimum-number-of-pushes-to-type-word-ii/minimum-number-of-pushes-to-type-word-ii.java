class Solution {
    public int minimumPushes(String word)
    {
        int c = 1;
        int e = 1;
        int arr[] = new int[26];
        for(char ch:word.toCharArray())
        {
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i=25;i>=0;i--)
        {
            if(arr[i]>0)
            {
                if(e>8)
                {
                    e=1;
                    c++;
                }
                sum+=arr[i]*c; 
                e++;   
            }
        }
        return sum;
    }
}