class Shape{
    int l = 10;
    int b = 20;
    public void area(){
        System.out.println("Area of shape is: ");
    }
}

class Triangle extends Shape{

    public void area(){
        System.out.println("Area of triangle is: " + (0.5 * l * b));
    }
}
class circle extends Shape{
    public void area(){
        System.out.println("Area of circle is: " + (3.14 * l * b));
    }
}

public class hheritance {
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        circle c = new circle();
        c.area();
    }
}
