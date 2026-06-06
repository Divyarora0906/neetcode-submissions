class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> newStack = new Stack<>();

        for (String ch : tokens) {
            System.out.println(ch);
            if (ch.equals("+")) {
                int second = newStack.pop();
                int first = newStack.pop();
                newStack.push(first + second);
            } else if (ch.equals("-")) {
                int second = newStack.pop();
                int first = newStack.pop();
                newStack.push(first - second);
            } else if (ch.equals("*")) {
                int second = newStack.pop();
                int first = newStack.pop();
                newStack.push(first * second);
            } else if (ch.equals("/")) {
                int second = newStack.pop();
                int first = newStack.pop();
                newStack.push(first / second);
            } else {
                newStack.push(Integer.parseInt(ch));
            }
        }
        return newStack.pop();
    }
}
