import java.util.*;

class InputForLinkedList{
    public static void main(String args[]){
        int n;
        Scanner scan = new Scanner(System.in);

        LinkedListMannual myList1 = new LinkedListMannual();
        LinkedListMannual myList2 = new LinkedListMannual();
        LinkedListMannual myList3 = new LinkedListMannual();
        LinkedListMannual myList4 = new LinkedListMannual();

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