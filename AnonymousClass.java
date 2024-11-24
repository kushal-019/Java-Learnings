import java.util.*;

interface demoInterface{
    void meth1();
    void meth2();
}

class AnonymousClass{
    public static void main(String args[]){

        demoInterface a = new demoInterface(){
            // @Overrides
            public void meth1(){
                System.out.println("This is meth 1");
            }
            // @Overrides 
            public void meth2(){
                System.out.println("This is meth 1");
            }
        };

        a.meth1();
    }
}