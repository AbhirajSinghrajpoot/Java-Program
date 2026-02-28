class MultiShape{
    int l = 10;
    int b = 20;
    public void area(){
        System.out.println("Area of shape is: ");
    }
}

class MultiTriangle extends MultiShape{

    @Override
    public void area(){
        System.out.println("Area of triangle is: " + (0.5 * l * b));
    }
}

class MultiEquilateralTriangle extends MultiTriangle{
    @Override
    public void area(){
        System.out.println("Area of equilateral triangle is: " + (0.5 * l * b));
    }
}

public class mheritance {
    
    public static void main(String[] args) {
        MultiTriangle triangle = new MultiTriangle();
        triangle.area();
        MultiEquilateralTriangle equilateralTriangle = new MultiEquilateralTriangle();
        equilateralTriangle.area();
    }
}
