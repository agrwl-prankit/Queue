package queueUsingArray;

public class QueueUsingArray {

    int[] queue = new int[5];
    int front = -1;
    int rear = -1;

    public void enqueue(int data){
        if (isFull()) System.out.println("queue is full");
        else {
            if (isEmpty()) front++;
            queue[++rear] = data;
            System.out.println(data + " inserted successfully");
        }
    }

    public void dequeue(){
        if (isEmpty()) System.out.println("Queue is already empty");
        else{
            int temp = queue[front];
            for (int i=front; i<=rear; i++){
                if (i == rear) {
                    queue[i] = 0;
                    rear--;
                }
                else queue[i] = queue[i+1];
            }
            if (rear == -1) front--;
            System.out.println(temp + " removed successfully");
        }
    }

    public void peek(){
        if (isEmpty()) System.out.println("Queue is empty");
        else System.out.println("peek value is: " + queue[front]);
    }

    public void show(){
        if (isEmpty()) System.out.println("Queue is empty");
        else {
            System.out.print("queue is: ");
            for (int i=front; i<=rear; i++) System.out.print(queue[i] + " ");
            System.out.println();
        }
    }

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
