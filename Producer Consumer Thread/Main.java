import java.util.*;

class Main{
    public static void main(String args[]){
        Company c = new Company();
        Producer prod = new Producer(c);
        Consumer cons = new Consumer(c);

        prod.start();
        cons.start();

        return;
    }
}