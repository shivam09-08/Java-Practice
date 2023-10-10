class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Overflow");
            System.exit(-1);
        }
        System.out.println("insertting item" + item);
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("underflow");
            System.exit(-1);
        }
        int x = arr[front];
        System.out.println("Removing item " + x);
        front = (front + 1) % capacity;
        count--;
        return x;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("underflow");
            System.exit(-1);
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public int size() {
        return count;
    }
}

public class QueueImpl {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Size of the queue is " + queue.size());
        System.out.println("Element at front " + queue.peek());
        queue.dequeue();
        queue.dequeue();
    }

}
