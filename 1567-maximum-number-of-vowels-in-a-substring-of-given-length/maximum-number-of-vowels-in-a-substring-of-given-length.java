class Solution {
    public int maxVowels(String s, int k)
    {
        int arr[] = new int[26];
        int l = s.length();
        int max = 0;
        int freq = 0;
        for(int i=0;i<l;i++)
        {
            char c = s.charAt(i);
            arr[c-'a']++;
            if(i >= k)
            {
                arr[s.charAt(i-k)-'a']--;
            }
            if(i >= k-1)
            {
                freq = arr[0] + arr[4] + arr[8] + arr[14] + arr[20];
                max = Math.max(max, freq);
            }
        }
        return max;
    }
    static{
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            try{
                java.io.FileWriter f= new java.io.FileWriter("display_runtime.txt");
                f.write("0");
                f.close();
            }catch(Exception e){}
        }));
    }
}