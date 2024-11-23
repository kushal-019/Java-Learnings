import java.util.*;

class Consumer extends Thread{

    Company c = new Company();

    Consumer(Company obj){
        this.c = obj;
    }

    public void run(){

        while(true){
            c.consumeItem();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}