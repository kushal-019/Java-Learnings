import java.util.*;

class Credit extends Thread{

    Bank bank = new Bank();

    Credit(Bank b){
        this.bank = b;
    }

    public void run(){

        int [] amt = {100000  ,  100 ,10000 , 1000 };

        for(int i=0;i<4;i++){
            bank.add(amt[i]);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
            System.out.println("\n");
        }
        
    }

}