import java.util.*;

abstract class Employee{
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee{
    void calculateSalary(){
        System.out.println("Salary : Rs " +  8000*12  );
    }
    
}
class PartTimeEmployee extends Employee{
    void calculateSalary(){
        System.out.println("Salary : Rs " +  5000*6  );
    }
    void calculateSalary(int hours){
        System.out.println("Salary : Rs " +  5000*hours  );
    }
}


class SalaryCalculate{
    
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        FullTimeEmployee ft = new FullTimeEmployee();
        PartTimeEmployee pt1 = new PartTimeEmployee();
        PartTimeEmployee pt2 = new PartTimeEmployee();

        ft.calculateSalary();
        pt1.calculateSalary();
        pt2.calculateSalary(9);
    }
}