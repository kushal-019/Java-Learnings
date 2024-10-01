import java.util.*;

class ArrayConcept{
    public static void main(String args[]){
        int  n;
        Scanner input = new Scanner(System.in);

        n  = input.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

        int toSearch = input.nextInt();

        for(int i=0;i<n;i++){
            if(toSearch == arr[i])System.out.print("index : " + (i+1) );
        }

        return ;
    }
}