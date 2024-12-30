class Student {
    private String name;
    private int age;
    private String grade;

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    // Display student details
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }
}

public class MethodChain {
    public static void main(String[] args) {
        
        Student student = new Student();
        student.setName("John Doe").setAge(20).setGrade("A");

        student.displayStudentInfo();
    }
}
