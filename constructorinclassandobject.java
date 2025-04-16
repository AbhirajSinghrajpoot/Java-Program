class Student{
    String name;
    int age;
    int rollno;

    public void studentInfo()
    {
        System.out.println("Information of student is: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Rollnumber: " + this.rollno);
    }
    Student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;

    }
}
public class constructorinclassandobject {
    public static void main(String args[]){

        Student s1 = new Student("Aman", 20, 1003);
        
        s1.studentInfo();
    }
    
}
