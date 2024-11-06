import java.util.*;


public interface  Shape{
    public void getSides();
    public void printArea();
}

class Quard implements Shape{
    Quard(String name){
        System.out.println(name);
    }
    abstract class Quadrilateral implements Shape {
    public abstract string GetName();
    public abstract double Area();
    public void getSides() {
        System.out.println(4);
    }
    public void getSides();
    public void printArea();
}
}

class Triangle implements Shape{
    Triangle(String name){
        System.out.println(name);
    }
}
class Circle implements Shape{
    double radius ;
    Circle(String name){
        getSides();
        printArea();
    }

    public void getSides(){
        Scanner scan = new Scanner(System.in);
        this.radius = scan.nextInt();
        return;
    }


    public void printArea(){
        System.out.println((3.14)*radius*radius);
        return;
    }
}



class ShapesArea {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String shapeName = scan.nextLine();

        Shape s ;

        switch(shapeName){
            case "Square" : s = new Quard("Square");
            break;
            case "Rectangle" : s = new Quard("Rectangle");
            break;
            case "Trapazium" : s = new Quard("Trapazium");
            break;
            case "Parallalogram" : s = new Quard("Parallalogram");
            break;

            case "Isoceles" :s = new Triangle("Isoceles");
            break;
            case "Equilateral" : s= new Triangle("Equilateral");
            break;
            case "Scalane" : s = new Triangle("Scalane");
            break;

            case "Circle" : s= new Circle("Circle");
            break;
        }
    }
}