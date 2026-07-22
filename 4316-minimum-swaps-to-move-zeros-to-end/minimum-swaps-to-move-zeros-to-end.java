class Solution {
    public int minimumSwaps(int[] nums) {
        // int i=nums.length-1;
        // while(nums[i]==0){
        //   while()
        // }
        // // int j;
        // // int c=0;
        // // for(j=0;j<i;j++){
        // //     if(nums[j]==0){
        // //         c++;
        // //         i--;
        // //     }
        // // }
        // return c;
        int l = 0;
        int r = nums.length-1;
        int c = 0;
        while(l<r)
        {
            while(l<r && nums[l]!=0)
            {
                l++;
            }
            while(r>0 && nums[r]==0)
            {
                r--;
            }
            if(l<r)
            {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
                c+=1;
            }
        }
        return c;
    }
}