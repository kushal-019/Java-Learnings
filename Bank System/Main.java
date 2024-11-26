import java.util.*;

class Main{

    public static void  main(String  args[]){
  
        Bank bank = new Bank();
        Debit debit = new Debit(bank);
        Credit credit = new Credit(bank);
        
        credit.start();
        debit.start();
        
        return ;
    }

}