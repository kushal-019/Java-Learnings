import java.util.*;

class SwitchCase{
    public static void main(String args[]){
        int n;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        switch(n){
            case 1 :   System.out.println("One");
            break;
            case 2 :   System.out.println("Two");
            break;
            case 3 :   System.out.println("Three");
            break;
            case 4 :   System.out.println("Four");
            break;
            default: System.out.println("Enter btw 1 to 4");
        }
    }
}