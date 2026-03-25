class Solution {
    public int findKthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> mh = new PriorityQueue<>();
        int len = nums.length;
        for(int i=0;i<k;i++)
        {
            mh.offer(nums[i]);
        }
        for(int i=k;i<len;i++)
        {
            if(nums[i]>mh.peek())
            {
                mh.poll();
                mh.offer(nums[i]);
            }
        }
        return mh.peek();
    }
}