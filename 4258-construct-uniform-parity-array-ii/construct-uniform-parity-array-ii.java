class Solution {
    public boolean uniformArray(int[] nums1)
    {
        int omin = Integer.MAX_VALUE;
        int emin = Integer.MAX_VALUE;
        int oc = 0;
        for(int a:nums1)
        {
            if(a%2==0 && a<omin)
            {
                omin = a;
            }
            if(a%2!=0 && a<emin)
            {
                emin = a;
            }
            if(a%2!=0)
            {
                oc+=1;
            }
        }
        int min = Math.min(omin,emin);
        if(min%2!=0)
        {
            return true;
        }
        else
        {
            if(oc==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }    
    }
}