class CopyStudent {
    String name;
    int age;

    public void studentInfo() {
        System.out.println("Information of student is: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // copy constructor

    CopyStudent(CopyStudent s1) {
        this.name = s1.name;
        this.age = s1.age;
    }
    CopyStudent(){
    }
}

public class copyconstructor {
    public static void main(String args[]) {
        CopyStudent s1 = new CopyStudent();
        s1.name = "aman";
        s1.age = 20;

        CopyStudent s2 = new CopyStudent(s1); // copy constructor
        s2.studentInfo(); // prints the information of s1
         }
}