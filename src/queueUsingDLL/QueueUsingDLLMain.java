package queueUsingDLL;

public class QueueUsingDLLMain {
    public static void main(String[] args) {
        QueueUsingDLL queue = new QueueUsingDLL();
        queue.show();
        queue.enqueue(1);
        queue.peek();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.peek();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.show();
        queue.dequeue();
        queue.dequeue();
        queue.show();
        queue.peek();
    }
}
