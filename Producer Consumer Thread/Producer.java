import java.util.*;

class Producer extends Thread{

    Company c = new Company();

    Producer(Company obj){
        this.c = obj;
    }

    public void run(){
        int i=0;

        while(true){
            c.produceItem(i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
            i++;
        }
    }
}