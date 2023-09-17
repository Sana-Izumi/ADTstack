package ADTstack;

import java.util.ArrayList;

public class Stack<S> {
    private ArrayList<S> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(S data) {
        stack.add(data);
    }

    public S pop() {
        if (isEmpty()) {
            return null; // or throw an exception
        }
        return stack.remove(stack.size() - 1);
    }

    public S peek() {
        if (isEmpty()) {
            return null; // or throw an exception
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int size() {
        return stack.size();
    }
}
