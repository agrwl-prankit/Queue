package circularQueueUsingArray;

public class CQUsingArrayMain {
    public static void main(String[] args) {
        CQueueUsingArray queue = new CQueueUsingArray(5);
        queue.show();
        queue.peek();
        queue.enqueue(1);
        queue.show();
        queue.peek();
        queue.dequeue();
        queue.show();
        queue.peek();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.show();
        queue.peek();
        queue.enqueue(6);
        queue.show();
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.show();
        queue.peek();
    }
}
