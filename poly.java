class Student{
    String name;
    int age;

    public void studentInfo(String name){
        System.out.println("Information of student is: ");
        System.out.println("Name: " + name);
    }
    public void studentInfo(int age){
        System.out.println("Information of student is: ");
        System.out.println("Age: " + age);
    }
    public void studentInfo(String name, int age){
        System.out.println("Information of student is: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    } 
}

public class poly {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 20;
        
        s1.studentInfo(s1.name); // prints the name of s1
        s1.studentInfo(s1.age); // prints the age of s1
        s1.studentInfo(s1.name, s1.age);
    }
    
}
