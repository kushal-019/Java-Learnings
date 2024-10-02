import java.util.*;

class LinkedList{

    Node head;
    private int size;


    LinkedList(){
        this.size = 0 ;
    }


    class Node{
        int data;
        Node next;

        Node(int val){
            this.next = null;
            this.data = val;
            size++;
        }

    }

    void addFirst(int val){
        Node temp = new Node(val);

        if(head != null)temp.next = head;

            head = temp;
    }

    void addLast(int val){
        Node temp = head;

        if(head == null)head = new Node(val);
        else{
            while(temp.next != null)temp = temp.next;

            temp.next = new Node(val);
        }

    }

    void removeLast(){
        Node temp =  head;

        if(temp.next == null)head = null;
        else {
            while(temp.next != null)temp = temp.next;
            temp = null;
        }
    }

    void removeFirst(){
        if(head.next == null)head = null;
        else {
            head = head.next;
        }
    }

    void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    void reverse(){
        if(head.next == null)return ;

        Node temp = head;
        Node prev = null;
        Node curr = head;

        while(curr != null){
            curr = curr.next;
            temp.next = prev;
            prev= temp;
            temp = curr;
        }

        head =  prev ;
        return ;
    }

}
