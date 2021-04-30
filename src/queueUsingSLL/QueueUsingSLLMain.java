package queueUsingSLL;

public class QueueUsingSLLMain {
    public static void main(String[] args) {
        QueueUsingSLL queue = new QueueUsingSLL();
        queue.show();
        queue.peak();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.size();
        queue.show();
        queue.peak();
        queue.dequeue();
        queue.dequeue();
        queue.size();
        queue.show();
        queue.peak();
    }
}
