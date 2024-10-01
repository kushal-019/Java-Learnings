import java.util.*;

class IfElse{
    public static void main(String args[]){
        int age;
        Scanner ageInput = new Scanner(System.in);

        age = ageInput.nextInt();

        if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

    }


}