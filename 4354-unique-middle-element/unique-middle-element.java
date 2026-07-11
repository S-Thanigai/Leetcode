class Solution {
    public boolean isMiddleElementUnique(int[] nums)
    {
        int n = nums.length;
        int arr[] = new int[101];
        for(int a:nums)
        {
            arr[a]++;
        }
        int mid = nums[n/2];
        return arr[mid]==1;
    }
}