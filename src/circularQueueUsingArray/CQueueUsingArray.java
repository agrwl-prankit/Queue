package circularQueueUsingArray;

public class CQueueUsingArray {

    int length;
    int currentSize = 0;
    int[] queue;
    int front = -1;
    int rear = -1;

    public CQueueUsingArray(int length) {
        queue = new int[length];
        this.length = length;
    }

    public void enqueue(int data){
        if (isFull()) {
            System.out.println("Queue is already full");
            return;
        }
        rear = (rear+1) % length;
        queue[rear] = data;
        currentSize++;
        if (front == -1) front = rear;
        System.out.println(data + " inserted successfully");
    }

    public void dequeue(){
        if (isEmpty()) System.out.println("Queue is already empty");
        else {
            int temp = queue[front];
            queue[front] = 0;
            front = (front+1) % length;
            currentSize--;
            System.out.println(temp + " removes successfully");
        }
    }

    public void peek(){
        if (isEmpty()) System.out.println("Queue is already empty");
        else {
            System.out.println("Peek element is: " + queue[front]);
        }
    }

    public void show(){
        if (isEmpty()) System.out.println("Queue is empty");
        else {
            System.out.print("front->" + queue[front] + " end->" + queue[rear] + " and queue is: ");
            for (int i : queue) System.out.print(i + " ");
            System.out.println();
        }
    }

    public boolean isFull(){
        return currentSize == length;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }
}
