
import  java.util.*;

class TwoD_Array{

    public static void ColSum(int [][] arr , int n , int m){

        System.out.println("\nPrinting Column wise sum ");

        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += arr[j][i];
            }
            System.out.println(sum);
        }

        return ;
    }
    public static void RowSum(int [][] arr , int n , int m){

        System.out.println("\nPrinting Row wise sum ");

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }

        return ;
    }

    public static void main(String args[]){
        int n,m;

        Scanner input = new Scanner(System.in);
        n = input.nextInt() ;
        m = input.nextInt();

        int [][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j= 0;j<m;j++){
                arr[i][j] = input.nextInt();
            }
        }

        RowSum(arr , n ,m);
        ColSum(arr , n ,m);

        return ;
    }
}