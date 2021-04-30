package queueUsingArray;

public class QueueUsingArray {

    int[] queue = new int[5];
    int front = -1;
    int rear = -1;

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return rear == queue.length-1;
    }

    public void size(){
        if (isEmpty()) System.out.println("Queue is empty");
        else System.out.println("Size of queue is: " + rear);
    }
}
