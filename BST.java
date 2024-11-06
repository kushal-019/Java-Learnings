import java.util.*;

class BST{

    class Node{
        Integer key;
        Integer value;
        Node left;
        Node right;

        Node(Integer key , Integer value){
            this.key = key;
            this.value =value;
            this.left = null;
            this.right = null;
        }

    }
    Node root;

    BST(){
        this.root = null;
    }

    public Integer get(Integer key){
        return get(root , key);
    }
    private Integer get(Node x , Integer key){
        if(x == null)return null;
        else if(x.key == key)return x.value;
        else if(x.key > key)return get(x.left , key);
        else return get(x.right , key);
    }
    public void put(Integer key , Integer value){
        root = put(root , key , value) ;
        return ;
    }

    private Node put(Node x , Integer key , Integer value){
        if(x == null)return  new Node(key , value);
        else if(key == x.key)x.value = value;
        else if(x.key < key)x.right = put(x.right , key ,value);
        else x.left = put(x.left , key ,value);
        return x;
    }

    public static void main(String args[]){
        BST b1 = new BST();

        b1.put(7,2);
        b1.put(2,3);
        b1.put(6,4);
        b1.put(1,5);
        b1.put(11,9);


        assert b1.get(7) == 2;
        assert b1.get(2) == 3;
        assert b1.get(6) == 4;
        assert b1.get(1) == 5;
        assert b1.get(11) == 9;
        assert b1.get(11) == 90;  
        // wrong assertion\
        assert b1.get(15) == null;
        return ;
    }
}