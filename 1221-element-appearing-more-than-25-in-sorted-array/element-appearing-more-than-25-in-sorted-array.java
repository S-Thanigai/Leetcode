class Solution {
    public int findSpecialInteger(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int per = arr.length / 4;
        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
            if (map.get(a) > per)
            {
                return a;
            }
        }
        return -1;
    }
}