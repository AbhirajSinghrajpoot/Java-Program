class Student{
    String name;
    static String school;
    public static void changeSchool(){
        Student.school = "ABC School";
    }
    }


public class statics {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "aman";
        Student.changeSchool(); // static method called using class name
        System.out.println("Name: " + s1.name);
        System.out.println("School: " + Student.school);
    }
}
