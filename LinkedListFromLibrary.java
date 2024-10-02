import java.util.*;

class LinkedListFromLibrary{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();


        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            int ele = scan.nextInt();
            list1.addFirst(ele);
            list2.addLast(ele);
        }

        System.out.println(list1);
        System.out.println(list2);
    }
}