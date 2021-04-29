public class Queue {

    int[] queue = new int[5];
    int front,rear, size;

    public void enqueue(int data){
        queue[rear] = data;
        rear++;
        size++;
        System.out.println(data + " inserted successfully");
    }

    public void show(){
        System.out.print("Elements in queue are : ");
        for (int i=0; i<size; i++) System.out.print(queue[i] + " ");
        System.out.println();
    }
}
