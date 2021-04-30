package queueUsingSLL;

public class SLLNode {

    SLLNode next;
    int data;

    public SLLNode(int data) {
        this.data = data;
        this.next = null;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
