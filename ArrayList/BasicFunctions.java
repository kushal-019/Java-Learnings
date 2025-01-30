import java.util.*;

class BasicFunctions{

    public static void addfunction(ArrayList<Integer>arr){
        for(int i=0;i<=10;i++){
            arr.add(i , i*i);
        }
        return ;
    }
    public static void addArrayListfunction(ArrayList<Integer>arr){
        arr.addAll(arr);
        System.out.println();
        return ;
    }
    public static void getfunction(ArrayList<Integer>arr){
        for(int i=0;i<=10;i++){
            System.out.print(arr.get(i) + " ");
        }
        return ;
    }
    public static void removefunction(ArrayList<Integer>arr){
        
            System.out.println(arr.remove(10) + " ");
            System.out.println(arr.remove(Integer.valueOf(121)) + " ");
        
        return ;
    }
    public static void clearfunction(ArrayList<Integer>arr){
        
            arr.clear();
        
        return ;
    }
    public static void setfunction(ArrayList<Integer>arr){
        
            arr.set(1,9);
        
        return ;
    }
    public static void containfunction(ArrayList<Integer>arr){
        
            System.out.println(arr.contains(25));
        
        return ;
    }
    public static void reversefunction(ArrayList<Integer>arr){
            System.out.println(arr);
            Collections.reverse(arr);
            System.out.println(arr);
        
        return ;
    }
    public static void sortfunction(ArrayList<Integer>arr){
            System.out.println(arr);
            Collections.reverse(arr);
            System.out.println(arr);
        
        return ;
    }
    public static void traverseList(ArrayList<Integer>arr){
        
            // for loop 
            // auto loop
            for(Integer a : arr)System.out.println(a);

            // iterator 
            Iterator<Integer> it = arr.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        
        return ;
    }


    public static void main(String args[]){
        ArrayList<Integer>arr = new ArrayList();
        addfunction(arr);

        // addArrayListfunction(arr);
        // System.out.println();

        // getfunction(arr);
        // System.out.println();

        // removefunction(arr);
        // System.out.println();

        
        // setfunction(arr);
        // System.out.println();
        
        // containfunction(arr);
        // System.out.println();
        
        // traverseList(arr);
        // System.out.println();
        
        // clearfunction(arr);
        // System.out.println();
        
        // reversefunction(arr);
        // System.out.println();

        // sortfunction(arr);
        // System.out.println();
        
        System.out.println(arr);
    }
};
