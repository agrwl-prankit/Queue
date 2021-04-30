package queueUsingSLL;

public class QueueUsingSLLMain {
    public static void main(String[] args) {
        QueueUsingSLL queue = new QueueUsingSLL();
        queue.show();
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.show();
    }
}
