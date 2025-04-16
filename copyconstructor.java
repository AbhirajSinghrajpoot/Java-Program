class Student {
    String name;
    int age;

    public void studentInfo() {
        System.out.println("Information of student is: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // copy constructor

    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
    }
    Student(){
    }
}

public class copyconstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 20;

        Student s2 = new Student(s1); // copy constructor
        s2.studentInfo(); // prints the information of s1
         }
}