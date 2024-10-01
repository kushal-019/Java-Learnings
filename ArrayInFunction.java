
import java.util.*;

class ArrayInFunction{

    public static int calcSum(int arr[] , int size){
        int sum = 0;

        for(int i=0;i<size;i++){
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String args[]){
        int n;
        Scanner inputScanner = new Scanner(System.in);
        n = inputScanner.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = inputScanner.nextInt();
        }

        System.out.println("Sum of all : " + calcSum(arr, n));
        return;
    }
}