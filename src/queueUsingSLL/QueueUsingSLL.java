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

    public boolean isempty(){
        return head == null;
    }
}
