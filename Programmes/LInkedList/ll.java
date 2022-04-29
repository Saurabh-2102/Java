package LInkedList;

import java.util.Stack;

public class ll {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;          //     head->6->9->8->7->4->null
        }
    }
    public static Node Reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node temp = null;
        while(curr!=null){
            temp = curr.next;
           curr.next  = prev;
           prev = curr;
           curr = temp;
        }
        head = prev;
        return head;
    }

 public static Node add(Node head1,Node head2){
     Stack<Integer> stack1 = new Stack<>();
     Stack<Integer> stack2 = new Stack<>();
     Node temp1 = head1;
     Node temp2 = head2;
     while(temp1!=null){
         stack1.add(temp1.data);
         temp1 = temp1.next;
     }
     while(temp2!=null){
         stack2.add(temp2.data);
         temp2 = temp2.next;
     }
     int carry = 0;
     Node sumLL = null;

     while (!stack1.isEmpty() || !stack2.isEmpty()){
         int a = 0;
         int b = 0;
         if(!stack1.isEmpty()){
             a = stack1.pop();
         }
         if(!stack2.isEmpty()){
             b = stack2.pop();
         }
         int sum = a + b +carry;
         Node new_node = new Node(sum%10);
         carry = sum/10;
         if ( sumLL == null){
             sumLL = new_node;
         }
         else {
             new_node.next = sumLL;
             sumLL = new_node;
         }
     }
     if(carry !=0){
         Node new_node = new Node(carry);
         new_node.next = sumLL;
         sumLL = new_node;
     }
     return sumLL;
 }
 public static void print(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
     System.out.println(" ");
 }



    public static void main(String[] args) {
        ll ll1 = new ll();
        Node head1 = new Node(5);
        head1.next = new Node(6);
        head1.next.next = new Node(3);// 5 6 3
        Node head2 = new Node(8);     // 8 4 8
        head2.next = new Node(4);     //  1 4 1 1
        head2.next.next = new Node(2);
        Node result = ll1.add(head1,head2);
         print(result);
         Node res = ll1.Reverse(head1);
         print(res);
    }
}
