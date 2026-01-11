class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            switch(op) {
                case "+":
                    int last = stack.pop();
                    int newScore = last + stack.peek();
                    stack.push(last);
                    stack.push(newScore);
                    break;

                case "D":
                    stack.push(stack.peek() * 2);
                    break;

                case "C":
                    stack.pop();
                    break;

                default:
                    stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) sum += score;
        return sum;
    }
}
