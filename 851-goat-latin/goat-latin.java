class Solution
{
    public String toGoatLatin(String sentence)
    {
        String arr[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        int c = 1;
        for(int i=0;i<arr.length;i++)
        {
            char wo[] = arr[i].toCharArray();
            if(wo[0]=='a' || wo[0]=='e' || wo[0]=='i' || wo[0]=='o' || wo[0]=='u' || wo[0]=='A' || wo[0]=='E' || wo[0]=='I' || wo[0]=='O' || wo[0]=='U')
            {
                sb.append(arr[i]);
                sb.append("ma");
            }
            else
            {
                sb.append(arr[i].substring(1,arr[i].length()));
                sb.append(wo[0]);
                sb.append("ma");
            }
            for(int j=0;j<=i;j++)
            {
                sb.append("a");
            }
            if(i!=arr.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}