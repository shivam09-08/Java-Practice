
class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("stack overflow !");
        } else {
            System.out.println("Inserting " + x);
            arr[++top] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow !");
        } else {
            System.out.println("Removing element " + arr[top]);

        }
        return arr[top--];
    }

    public boolean isEmpty()

    {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

}

public class StackImpl {
    public static void main(String[] args) {
        Stack stacko = new Stack(3);
        stacko.push(1);
        stacko.push(2);
        stacko.push(3);
        stacko.pop();
        stacko.pop();
        stacko.pop();
        System.out.println("is stack is empty" + stacko.isEmpty());
        System.out.println("is stack is full " + stacko.isFull());

    }
}
