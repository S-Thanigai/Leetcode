class Solution {
    public int subsetXORSum(int[] nums)
    {
        return dfs(nums,0,0);
    }
    private int dfs(int arr[],int i,int sum)
    {
        if(i==arr.length)
        {
            return sum;
        }
        int in = dfs(arr,i+1,sum^arr[i]);
        int ex = dfs(arr,i+1,sum);
        return in+ex;
    }
}