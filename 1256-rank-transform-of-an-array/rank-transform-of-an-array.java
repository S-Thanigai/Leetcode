class Solution {
    public int[] arrayRankTransform(int[] arr)
    {
        int clo[] = arr.clone();
        Arrays.sort(clo);
        int rank = 1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:clo)
        {
            if(!hm.containsKey(n))
            {
                hm.put(n,rank++);
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}