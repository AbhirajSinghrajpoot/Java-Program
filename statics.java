class StaticStudent{
    String name;
    static String school;
    public static void changeSchool(){
        StaticStudent.school = "ABC School";
    }
    }


public class statics {
    public static void main(String args[]){
        StaticStudent s1 = new StaticStudent();
        s1.name = "aman";
        StaticStudent.changeSchool(); // static method called using class name
        System.out.println("Name: " + s1.name);
        System.out.println("School: " + StaticStudent.school);
    }
}
