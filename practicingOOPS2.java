import java.util.*;

interface BasicAnimal{
    void eat();
    void sleep();
}


class Monkey{
    public void jump(){
        System.out.println("Jump");
    }
    public void bite(){
        System.out.println("Bite");
    }

}

class Human extends Monkey implements BasicAnimal {
    public void eat(){
        System.out.println("Eat");
    }
    public void sleep(){
        System.out.println("Sleep");
    }
}

class practicingOOPS2{
    public static void main(String args[]){
        Monkey m1 = new Monkey();
        Human h1 = new Human();

        System.out.println("\n-------- Human --------- \n");

        h1.eat();
        h1.sleep();
        h1.jump();
        h1.bite();

        System.out.println("\n-------- Monkey --------- \n");

        // m1.eat();
        // m1.sleep();
        m1.jump();
        m1.bite();

        return;
    }
}