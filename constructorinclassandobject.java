class ConstructorStudent{
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
    ConstructorStudent(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;

    }
}
public class constructorinclassandobject {
    public static void main(String args[]){

        ConstructorStudent s1 = new ConstructorStudent("Aman", 20, 1003);
        
        s1.studentInfo();
    }
    
}
