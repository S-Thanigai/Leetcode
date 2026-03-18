class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int nums3[] = new int[n1+n2];
        int k = 0;
        for(int i=0;i<n1;i++)
        {
            nums3[k++] = nums1[i];
        }
        for(int i=0;i<n2;i++)
        {
            nums3[k++] = nums2[i];
        }
        Arrays.sort(nums3);
        int n3 = n1+n2;
        if(n3%2!=0)
        {
            return (double)nums3[n3/2];
        }
        else
        {
            double d1 = nums3[n3/2];
            double d2 = nums3[(n3/2)-1];
            return (d1+d2)/2;
        }
    }
}