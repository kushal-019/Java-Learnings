import java.util.*;

class Debit extends Thread{

    Bank bank = new Bank();

    Debit(Bank b){
        this.bank = b;
    }

    public void run(){

        int [] amt = {100 , 1000 , 10000 , 1000000};

        for(int i=0;i<4;i++){
            bank.sub(amt[i]);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
            System.out.println("\n");
        }

    }

}