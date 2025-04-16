interface Animal {
    void walk();
}
class Dog implements Animal {
    public void walk()
    {
        System.out.println("Dog is walking");
    }
}


public class interfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
    }
}

// Multiple inheritance is not supported in Java.
//  so we use interfaces to achieve multiple inheritance.

