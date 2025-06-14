import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 900);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "Megan", 1000);
        ghs.addTeacher(megan);

        Student samar = new Student(4, "Samar", 9);
        ghs.addStudent(samar);

        tamasha.payFees(5000);
        rakshith.payFees(6000);
        samar.payFees(8000);

        System.out.println("GHS has earned: " + ghs.getTotalMoneyEarn() + "$");

        System.out.println("------MAKING SCHOOL PAY SALARY------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " and now has " + ghs.getTotalMoneyEarn() + "$");
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName() + " and now has " + ghs.getTotalMoneyEarn() + "$");
        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println("GHS has spent for salary to " + mellisa.getName() + " and now has " + ghs.getTotalMoneyEarn() + "$");
        megan.receiveSalary(megan.getSalary());
        System.out.println("GHS has spent for salary to " + megan.getName() + " and now has " + ghs.getTotalMoneyEarn() + "$");

        System.out.println();
        System.out.println(rakshith);
        System.out.println(mellisa);
        System.out.println(megan);
        System.out.println(samar);
    }
}
