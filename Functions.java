import java.util.*;

class Functions{

    public static void printFunction(int n){
        for(int x =0 ;x<n;x++){
            for(int y = 0 ;y<= x;y++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        return;
    }
    
    public static void main(String args[]){
        int n;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        printFunction(n);
    }
}