package easy;

import java.util.Stack;

public class Q0155_MinStack {
    private int min = Integer.MAX_VALUE;
    private Stack<Integer> stack = new Stack<>();

    // push both old min and x if x is the new min
    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }

        stack.push(x);
    }

    // pop another element if the pop'd element is min
    // set the 2nd pop'd element as the new min
    public void pop() {
        int pop = stack.pop();
        if (pop == min)
            min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public static void main(String[] args) {
        Q0155_MinStack minStack = new Q0155_MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
