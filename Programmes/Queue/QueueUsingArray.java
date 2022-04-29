package Queue;

import java.util.*;

public class QueueUsingArray {
    int front;
    int rear;
    int capacity;
    int[] queue;
    QueueUsingArray(int capacity){
       this.capacity = capacity;
       queue = new int[capacity];
       front = -1;
       rear = -1;
    }
    private boolean isEmpty(){
        if(front == -1 || front > rear)
            return true;
        return false;
    }
    private boolean isFull(){
        if(rear == (capacity-1))
            return true;
        return false;
    }
    private void traverse(){
        if (isEmpty())
            System.out.println("queue is empty");
        else for (int i = front; i <= rear ; i++) {
            System.out.print(queue[i]+" ");
        }
    }
    private void add(int x){
        if (isFull())
            System.out.println("queue is full you cant add here anything );");
        else
            if (isEmpty())
                front = 0;
            rear = rear +1;
            queue[rear] = x;
    }
    private void remove(){
        if(isEmpty())
            System.out.println("queue is already empty");
        else front =front+1;
    }
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(10);
        q.add(4);
        q.add(5);
        q.add(6);q.add(4);q.add(4);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.add(44);

        System.out.println(q.isFull());

        q.traverse();
        System.out.println();
        q.remove();
        q.traverse();
        System.out.println();
        q.remove();
        q.traverse();
        System.out.println();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

    }
}
