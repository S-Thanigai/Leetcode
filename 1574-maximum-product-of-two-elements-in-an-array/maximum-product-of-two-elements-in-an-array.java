class Solution {
    public int maxProduct(int[] nums)
    {
        int len=nums.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }
            else if(max2<nums[i]){
                max2=nums[i];
            }
        }

        return (max1-1)*(max2-1);
    }
}