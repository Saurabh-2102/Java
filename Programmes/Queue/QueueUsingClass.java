package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingClass {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(4);
        q.add(2);
        q.add(9);
        q.add(6);
        q.add(5);
        q.add(2);
        q.add(3);
        System.out.println(q.element());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.peek());
        q.remove(5);
        System.out.println(q);
        q.clear();
        System.out.println(q);
    }


}
