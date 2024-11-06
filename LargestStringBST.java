import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


class LargestStringBST{

    class Node{
        String key;
        Integer value;
        Node left;
        Node right;

        Node(String key ){
            this.key = key;
            this.value = 1;
            this.left = null;
            this.right = null;
        }

    }
    Node root;
    Integer count = -1;
    String s;

    LargestStringBST(){
        this.root = null;
    }

    public void get(){
        get(root);
        System.out.println(s);
        System.out.println(count);
        return ;
    }
    private void get(Node x){
        if(x == null)return ;
        else if(x.value > count){
            count = x.value;
            s = x.key;
        }
        get(x.left );
        get(x.right );
    }
    public void put(String key){
        root = put(root , key ) ;
        return ;
    }

    private Node put(Node x , String key ){
        if(key.length() < 10)return x;
        if(x == null)return  new Node(key);

        int comparison = key.compareTo(x.key);
        if (comparison == 0)  x.value = x.value +1;
        else if (comparison > 0) x.right = put(x.right, key);
        else x.left = put(x.left, key);
        
        return x;
    }

    public static void main(String[] args) {
        try {
            
            long timestamp1 = System.currentTimeMillis();
            System.out.println("Current timestamp: " + timestamp1);

            File file = new File("words.txt"); 
            Scanner scanner = new Scanner(file);
            LargestStringBST b1 = new LargestStringBST();
            while (scanner.hasNext()) {
                String word = scanner.next(); 
                b1.put(word);
            }
            scanner.close();
            b1.get();

            long timestamp2 = System.currentTimeMillis();
            System.out.println("Current timestamp: " + timestamp2);
            System.out.println((timestamp2- timestamp1)/1000);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

}
