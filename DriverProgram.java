package ADTstack;

public class DriverProgram {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        // Insert 0 at the bottom of myStack
        InsertBottom.insertAtBottom(myStack, 0);

        // Display the stack
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}

class InsertBottom {
    public static <S> void insertAtBottom(Stack<S> stack, S element) {
        Stack<S> tempStack = new Stack<>();

        // Move all elements from the original stack to the temporary stack
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        // Insert the new element at the bottom of the original stack
        stack.push(element);

        // Move all elements back from the temporary stack to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
