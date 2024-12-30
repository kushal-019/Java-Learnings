import java.util.*;
import java.util.stream.*;

class StreamJava{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<Integer>();
        
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        
        Integer sum = arr.stream()
        .filter((number)-> number%2 != 0)
        .map(numner -> numner*numner)
        .reduce(0 , (a,b)->a+b);
        
        System.out.println(sum);
        
        ArrayList<String>arr2 = new ArrayList<String>(Arrays.asList("Kushal" , "Goel"));
        
        Integer sumLen = arr2.stream()
        .filter(name->name != "")
        .map(name -> name.length())
        .reduce(0 , (a,b)->a+b);
        
        System.out.println(sumLen);

    }
}