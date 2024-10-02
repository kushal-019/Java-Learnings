import java.util.*;

class CustomStack{
    Node head;
    Node curr;
    int size ;
    int currSize;

    CustomStack(int n){
        this.size = n;
        this.currSize = 0;
    }

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int val){
            this.data = val;
            this.next = null;
            this.prev = null;
            currSize++;
        }
    }

    void insert(int val){
        if(head == null){
            head = new Node(val);
            curr = head;
            return ;
        }
        if(currSize == size ){
            System.out.println("Stack is Full");
            return;
        }

        Node temp = new Node(val);

        curr.next = temp;
        temp.prev = curr;

        curr = curr.next;

    }

    int peek(){
        if(currSize == 0 ){
            System.out.println("Stack is Empty");
            return -1;
        }
        
        return curr.data;
    }


    void pop(){
        if(currSize == 0 ){
            System.out.println("Stack is Empty");
            return;
        }
        if(currSize == 1){
            head = null;
            curr = null;
            currSize--;
            
            return;
        }
        currSize--;
        curr = curr.prev;
        curr.next = null;
        return;
    }

    void printStack(){
        if(currSize == 0 ){
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return;
    }


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt();
        CustomStack st = new CustomStack(n);


        for(int i=0;i<n;i++){
            int ele = scan.nextInt();
            st.insert(ele);
        }
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.printStack();
    }
}