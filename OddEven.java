import java.util.*;

class OddEven{
    public static void main(String args[]){
        int number;

        Scanner numberScanner = new Scanner(System.in);

        number  = numberScanner.nextInt();

        if(number == 0){    
            System.out.println("Zero");
        }
        else if(number % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}