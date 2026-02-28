// class Pen {
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Wrinting something for first Pen...");
//     }
//     public void printPen1(){
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
//     public void written(){
//         System.out.println("Written something for second Pen...");
//     }
//     public void printPen2(){
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
// }

class BasicStudent{
    String name;
    int age;
    int rollnumber;

    void studentInfo(){
        System.out.println("Infomation of student is: ");
    }

    void printInfo(){
        System.out.println("Name:" + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Rollnumber: "+ this.rollnumber);
    }
}

public class classandobject {
    public static void main(String[] args){
        // Pen p1 = new Pen();
        // p1.color = "blue.";
        // p1.type = "gel.";

        // Pen p2 = new Pen();

        // p2.color = "black.";
        // p2.type = "ballpoint.";


        // p1.write();
        // p1.printPen1();

        // p2.written();
        // p2.printPen2();
        // System.out.println("Pen color is: " + p1.color + ".");
        // System.out.println("Pen type is: "+ p1.type +".");
        

        BasicStudent s1 = new BasicStudent();
        s1.name = "John.";
        s1.age = 19;
        s1.rollnumber = 1003;

        s1.studentInfo();
        s1.printInfo();

    }
    
}
