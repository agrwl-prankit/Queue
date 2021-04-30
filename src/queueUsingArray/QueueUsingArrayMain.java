package queueUsingArray;

public class QueueUsingArrayMain {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        queue.show();
        queue.dequeue();
        queue.enqueue(1);
        queue.show();
        queue.dequeue();
        queue.show();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.show();
        queue.peek();
        queue.dequeue();
        queue.peek();
    }
}
