import java.util.*;


//THE ONLY DIFF BTW ABSTRACT AND INTERFACE IS THAT INTERFACE CANT HAVE DEFINED BODY (CONCRETE METHODS) FOR THE FUNCTION NAME IN INTERFACE CLASS BUT ABSTRACT CLASS CAN HAVE BOTH CONCRETE AND ABSTRACT METHODS. ONLY IN ABSTRACT METHOD, USER NEED TO DEFINE ITS ABSTRACT ELSE BOTH ARE SAME. ALSO ONE CLASS CANT EXTEND MORE THAN ONE ABSTRACT CLASS BUT ONE CLASS CAN INPLEMENT MORE THAN ONE INTERFACE. ALL YOU NEED TO DO IS TO OVERRIDE OR REDEFINE THE BODY FOR ALL THE ABSTRACT METHODS DECLARED IN INTERFACE. Also we cant create instance of abstract class but can create an instance for the class from which some properties are inherited.


interface Pen1{
    void write();
    void refill();

}

class FountainPen1 implements Pen1{
    public void changeNib(){
        System.out.println("Changed the nib");
    }
    @Override
    public void write(){
        System.out.println("writing with pen");
    }
    public void refill(){
        System.out.println("Changed the refill");
    }
}

abstract class Pen2{
    abstract void write();
    void refill(){
        System.out.println("Changed the refill");
    }

}

class FountainPen2 extends Pen2{
    public void changeNib(){
        System.out.println("Changed the nib");
    }
    @Override
    public void write(){
        System.out.println("writing with pen");
    }
    
}

class practicingOOPS1{
    public static void main (String args[]){
        System.out.println("hello ! working fine");
        
        FountainPen1 pen1 = new FountainPen1();
        System.out.println("\n-------- Pen1 --------- \n");
        
        pen1.changeNib();
        pen1.refill();
        pen1.write();
        
        FountainPen2 pen2 = new FountainPen2();
        System.out.println("\n-------- Pen2 --------- \n");

        pen2.changeNib();
        pen2.refill();
        pen2.write();


        return ;
    }


}