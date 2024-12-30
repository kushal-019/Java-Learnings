import java.util.*;

abstract class Shape{
    abstract void getArea();
}

class Circle extends Shape{
    int radius ;
    Circle(int r){
        this.radius = r;
    }

    void getArea(){
        System.out.println("Area of Circle : "+3.14*radius*radius + "\n");
    }
}
class Square extends Shape{
    int side ;
    Square(int s){
        this.side = s;
    }

    void getArea(){
        System.out.println("Area of Square : "+side*side + "\n");
    }
}
class Reactangle extends Shape{
    int length , breadth ;
    Reactangle(int l ,int b){
        this.length = l;
        this.breadth = b;
    }

    void getArea(){
        System.out.println("Area of Reactangle : "+length*breadth + "\n");
    }
}

class AreaOfShapes{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        Square sq = new Square(side);
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        Reactangle rect = new Reactangle(length , breadth);
        int radius = scan.nextInt();
        Circle cr = new Circle(radius);
        sq.getArea();
        rect.getArea();
        cr.getArea();
        return;
    }
}