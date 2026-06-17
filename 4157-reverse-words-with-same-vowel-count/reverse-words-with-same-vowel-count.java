class Solution {
    public String reverseWords(String s)
    {
        String arr[] = s.split(" ");
        String fi = arr[0];
        int c = 0;
        StringBuilder sb = new StringBuilder(fi);
        for(char ch:fi.toCharArray())
        {
            if("AEIOUaeiou".indexOf(ch)!=-1)
            {
                c+=1;
            }
        }
        if(arr.length!=1)
        {
            sb.append(" ");
        }
        for(int i=1;i<arr.length;i++)
        {
            int co = 0;
            for(char ch:arr[i].toCharArray())
            {
                if("AEIOUaeiou".indexOf(ch)!=-1)
                {
                    co+=1;
                }
            }
            if(c==co)
            {
                StringBuilder re = new StringBuilder(arr[i]);
                sb.append(re.reverse());
            }
            else
            {
                sb.append(arr[i]);
            }
            if(i!=arr.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}