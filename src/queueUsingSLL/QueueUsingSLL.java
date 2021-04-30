package queueUsingSLL;

public class QueueUsingSLL {

    SLLNode head;

    public void enqueue(int data){
        SLLNode newNode = new SLLNode(data);
        if (isempty()) head = newNode;
        else {
            SLLNode temp = head;
            while (temp.getNext() != null) temp = temp.getNext();
            temp.setNext(newNode);
        }
        System.out.println(data + " inserted successfully");
    }

    public void dequeue(){
        if (isempty()) System.out.println("Queue is already empty");
        else {
            int temp = head.getData();
            head = head.getNext();
            System.out.println(temp + " removed successfully");
        }
    }

    public void peak(){
        if (isempty()) System.out.println("Queue is empty");
        else System.out.println("Peak element is: " + head.getData());
    }

    public void show(){
        if (isempty()) System.out.println("Queue is empty");
        else {
            System.out.print("Queue is: ");
            SLLNode temp = head;
            while (temp != null){
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    public void size(){
        if (isempty()) System.out.println("Size of queue is: 0");
        else {
            int size = 0;
            SLLNode temp = head;
            while (temp != null){
                size++;
                temp = temp.getNext();
            }
            System.out.println("Size of queue is: " + size);
        }
    }

    public boolean isempty(){
        return head == null;
    }
}
