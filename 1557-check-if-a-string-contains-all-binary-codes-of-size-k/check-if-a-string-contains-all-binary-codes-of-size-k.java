class Solution {
    public boolean hasAllCodes(String s, int k)
    {
        // Set<String> li = new HashSet<>();
        // int pow =(int) Math.pow(2,k);
        // for(int i=0;i<pow;i++)
        // {
        //     String bin = Integer.toBinaryString(i);
        //     bin = String.format("%" + k + "s", bin).replace(' ', '0');
        //     li.add(bin);
        // }
        // for(String st:li)
        // {
        //     if(s.indexOf(st)==-1)
        //     {
        //         return false;
        //     }
        // }
        // return true;
        int len = s.length();
        HashSet<String> hs = new HashSet<>();
        if(len<k)
        {
            return false;
        }
        int pow = 1<<k;
        for(int i=0;i<=len-k;i++)
        {
            String sub = s.substring(i,i+k);
            hs.add(sub);
            if(hs.size()==pow)
            {
                return true;
            }
        }
        return false;
    }
}