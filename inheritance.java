class Shape {
    String color;
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a triangle with color: " + color);
    }
}

public class inheritance {

    public static void main(String[] ars){
        Triangle t = new Triangle();
        t.color = "Red";
        t.draw();
    }
}