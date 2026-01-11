class Solution {
    public char findTheDifference(String s, String t)
    {
       List<Character> li = new LinkedList<>();

        for (char a : s.toCharArray()) {
            li.add(a);
        }

        for (char a : t.toCharArray()) {
            if (!li.remove((Character) a)) {
                return a;
            }
        }
        return ' ';
    }
}