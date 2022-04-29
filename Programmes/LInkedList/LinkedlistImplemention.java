package LInkedList;

public class LinkedlistImplemention {
    Node head;
    Node tail;

    void addfirst(int x){
        Node newnode = new Node(x,head);
        head = newnode;
    }
    void addafter(int x ,int newelement){
        Node foundnod = getnode(x);
        if(foundnod!=null){
            Node newnode = new Node(newelement,foundnod.next);
            foundnod.next = newnode;
        }
        else{
            System.out.println("elemetn cant added");
        }
    }
    void addbefore(int x ,int newelement){
        Node foundnod = getprevnode(x);
        if(foundnod!=null){
            Node newnode = new Node(newelement,foundnod.next);
            foundnod.next = newnode;
        }
        else{
            System.out.println("elemetn cant added");
        }
    }

    Node getprevnode(int x){
        Node temp = head;
        Node prev = head;
        while(temp!=null){
            if(temp.data==x){
                return prev;
            }
            prev = temp;
            temp = temp.next;
        }
        return null;
    }

    Node getnode(int x){
        Node temp = head;
        while(temp!=null){
            if(temp.data==x){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    void add(int x){
        Node newnode = new Node(x,null);
//        temp.data = x;

        if (head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;

        }
    }
    void show(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();

    }


    class Node{
        int data;
        Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }






    public static void main(String[] args) {
        LinkedlistImplemention myll = new LinkedlistImplemention();
        myll.add(5);
        myll.add(6);
        myll.add(2);
        myll.add(8);
        myll.add(5);
        myll.show();
        myll.add(8);
        myll.show();
        myll.addfirst(1);
        myll.show();
        myll.addafter(2,3);
        myll.show();
        myll.addbefore(8,0);
        myll.show();



    }








}
