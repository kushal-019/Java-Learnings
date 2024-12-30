import java.util.*;
import java.util.function.*;

interface Multiply{
    int multiply(int a, int b) ;
}

class Lambda  {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        Integer a = scan.nextInt();
        Integer b = scan.nextInt();

        BiFunction<Integer,Integer , Integer>Sum =(x,y)->{
            return x+y;
        };
        
        Multiply m = (x,y) -> x*y;

        
        System.out.println("SUM is : " + Sum.apply(a,b));
        System.out.println("SUM is : " + m.multiply(a,b));
    }
}