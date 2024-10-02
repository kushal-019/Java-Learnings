import java.util.*;

class InputForLinkedList{
    public static void main(String args[]){
        int n;
        Scanner scan = new Scanner(System.in);

        LinkedList myList1 = new LinkedList();
        LinkedList myList2 = new LinkedList();
        LinkedList myList3 = new LinkedList();
        LinkedList myList4 = new LinkedList();

        n  = scan.nextInt();

        for(int i=0;i<n;i++){
            int ele = scan.nextInt();
            myList1.addFirst(ele);
            myList2.addLast(ele);
        }

        myList1.printList();
        myList2.reverse();
        myList2.printList();
    }
}