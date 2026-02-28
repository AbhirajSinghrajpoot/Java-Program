class SingleShape{
    int l = 10;
    int b = 20;
    public void area(){
        System.out.println("Area of shape is: ");
    }
}

class SingleTriangle extends SingleShape{

    @Override
    public void area(){
        System.out.println("Area of triangle is: " + (0.5 * l * b));
    }
}

public class sheritance {
    
    public static void main(String[] args) {
        SingleTriangle triangle = new SingleTriangle();
        triangle.area();
    }
}
