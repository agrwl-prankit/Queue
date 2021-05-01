package circularQueueUsingArray;

public class CQueueUsingArray {

    int length;
    int[] queue = new int[length];
    int front = -1;
    int rear = -1;

    public CQueueUsingArray(int length) {
        this.length = length;
    }

    public void enqueue(int data){
        if (isFull()) {
            System.out.println("Queue is already full");
            return;
        }
        rear = (rear+1) % length;
        queue[rear] = data;
        if (front == -1) front = rear;
        System.out.println(data + " inserted successfully");
    }

    public void dequeue(){
        if (isEmpty()) System.out.println("Queue is already empty");
        else {
            int temp = queue[front];
            queue[front] = 0;
            front = (front+1) % length;
            System.out.println(temp + " removes successfully");
        }
    }

    public boolean isFull(){
        return (rear+1)%length == front;
    }

    public boolean isEmpty(){
        return front == -1;
    }
}
