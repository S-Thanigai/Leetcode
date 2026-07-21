class Solution {
    public int compareVersion(String version1, String version2)
    {
        int l1 = version1.length();
        int l2 = version2.length();
        int v1 = 0;
        int v2 = 0;
        while(v1<l1 || v2<l2)
        {
            int s1 = 0;
            int s2 = 0;
            while(v1<l1 && version1.charAt(v1)!='.')
            {
                s1 = s1*10;
                s1+=(version1.charAt(v1)-'0');
                v1++;
            }
            while(v2<l2 && version2.charAt(v2)!='.')
            {
                s2 = s2*10;
                s2+=(version2.charAt(v2)-'0');
                v2++;
            }
            if(s1<s2)
            {
                return -1;
            }
            else if(s1>s2)
            {
                return 1;
            }
            else
            {
                v1++;
                v2++;
            }
        }
        return 0;
    }
}