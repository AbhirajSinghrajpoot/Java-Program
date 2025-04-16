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

class EquilateralTriangle extends Triangle{
    public void area(){
        System.out.println("Area of equilateral triangle is: " + (0.5 * l * b));
    }
}

public class mheritance {
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.area();
    }
}
