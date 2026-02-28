class HybridShape{
    int l = 10;
    int b = 20;
    public void area(){
        System.out.println("Area of shape is: ");
    }
}

class HybridTriangle extends HybridShape{

    @Override
    public void area(){
        System.out.println("Area of triangle is: " + (0.5 * l * b));
    }
}
class HybridCircle extends HybridShape{
    @Override
    public void area(){
        System.out.println("Area of circle is: " + (3.14 * l * b));
    }
}

public class hheritance {
    
    public static void main(String[] args) {
        HybridTriangle triangle = new HybridTriangle();
        triangle.area();
        HybridCircle c = new HybridCircle();
        c.area();
    }
}
