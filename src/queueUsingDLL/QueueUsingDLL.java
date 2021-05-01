package queueUsingDLL;

public class QueueUsingDLL {

    DLLNode head;

    public void enqueue(int data){
        DLLNode newNode = new DLLNode(data);
        if (isEmpty()){
            head = newNode;
        } else {
            DLLNode temp = head;
            while (temp.getNext() != null) temp = temp.getNext();
            temp.setNext(newNode);
            newNode.setPrevious(temp);
        }
        System.out.println(data + " insert successfully");
    }

    public void dequeue(){
        if (isEmpty()) System.out.println("Queue is already empty");
        else {
            int data = head.getData();;
            head = head.getNext();
            System.out.println(data + " deleted successfully");
        }
    }

    public void peek(){
        if (isEmpty()) System.out.println("Queue is empty");
        else System.out.println("Peek element is: " + head.getData());
    }

    public void show(){
        if (isEmpty()) System.out.println("Queue is empty");
        else {
            System.out.print("Queue is: ");
            DLLNode temp = head;
            while (temp != null){
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}
