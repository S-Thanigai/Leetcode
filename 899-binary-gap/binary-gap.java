class Solution {
    public int binaryGap(int n)
    {
        String b = Integer.toBinaryString(n);
        int ma = 0;
        int i = 0;
        int j = i+1;
        int l = b.length();
        while(i<l && j<l)
        {
            if(b.charAt(i)==b.charAt(j))
            {
                int d = j-i;
                ma = Math.max(ma,d);
                i=j;
            }
            j++;
        }
        return ma;
    }
}