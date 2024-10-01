import java.util.*;

class ForLoop{
    public static void main(String args[]){
        int n;
        Scanner input = new Scanner(System.in);

        n=  input.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
                System.out.print("\n");
        }
    }
}