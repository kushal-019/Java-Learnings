import java.util.*;

class Bank{

    int money;
    boolean flag = true;

    Bank(){
        this.money = 0;
    }

    synchronized public void add(int val){
        
        if(!flag){
            try{
                wait();
            }
            catch(Exception e){}
        }
        money += val;
        System.out.println("Money credited : " + val);
        System.out.println("Total money : " + money);
        flag = false;
        try{
            notify();
        }
        catch(Exception e){}
        return;
    }
    synchronized public void sub(int val){
        
        if(flag){
            try{
                wait();
            }
            catch(Exception e){}
        }
        if(val <= money){
            money -= val;
            System.out.println("Money debited : " + val);
            System.out.println("Total money : " + money);
        }
        else {
            System.out.println("Insufficient balance : " + money);
        }
        flag = true;
        try{
            notify();
        }
        catch(Exception e){}
        return;
    }

}