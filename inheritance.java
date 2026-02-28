class InheritanceShape {
    String color;
}

class InheritanceTriangle extends InheritanceShape {
    public void draw() {
        System.out.println("Drawing a triangle with color: " + color);
    }
}

public class inheritance {

    public static void main(String[] ars){
        InheritanceTriangle t = new InheritanceTriangle();
        t.color = "Red";
        t.draw();
    }
}