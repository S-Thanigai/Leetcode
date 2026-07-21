class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
        // Set<Integer> s = new HashSet<>();
        // Set<Integer> res  = new HashSet<>();
        // for(int n:nums1)
        // {
        //     s.add(n);
        // }    
        // for(int n:nums2)
        // {
        //     if(s.contains(n))
        //     {
        //         res.add(n);
        //     }
        // }
        // int arr[] = new int[res.size()];
        // int i = 0;
        // for(int r:res)
        // {
        //     arr[i++] = r;
        // }
        // return arr;
        Set<Integer> s = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                s.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        int arr[] = new int[s.size()];
        int k = 0;
        for(int r:s)
        {
            arr[k++] = r;
        }
        return arr;
    }
}