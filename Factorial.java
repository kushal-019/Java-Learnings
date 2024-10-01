import java.util.*;

class Factorial{
    public static void main(String args[]){
        int num;

        Scanner numScanner = new Scanner(System.in);
        num = numScanner.nextInt();

        num = findFact(num);

        System.out.print(num);

        return;
    }

    public static int findFact(int num){
        if(num <= 1)return 1;

        return num * findFact(num-1);
    }
}