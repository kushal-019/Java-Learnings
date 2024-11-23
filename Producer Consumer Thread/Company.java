import java.util.*;

class Company{

    int currentNumber;
    boolean flag = false;

    synchronized public void produceItem(int n){
        if(flag){
            try{
                wait();
            }
            catch(Exception e){}
        }
        
        this.currentNumber = n;
        System.out.println("Produced : " + currentNumber);
        flag = true;
        notify();
    }
    synchronized public int consumeItem(){
        if(!flag){
            try{
                wait();
            }
            catch(Exception e){}
        }
        System.out.println("Consumed : " + currentNumber);
        flag = false;
        notify();
        return this.currentNumber;
    }

}