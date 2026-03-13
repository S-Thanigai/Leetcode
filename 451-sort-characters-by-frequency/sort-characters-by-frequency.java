class Solution {
    public String frequencySort(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> li = new ArrayList<>(map.keySet());
        li.sort((a,b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for(char c:li)
        {
            int f = map.get(c);
            for(int i=0;i<f;i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}