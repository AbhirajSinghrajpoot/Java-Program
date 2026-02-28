interface BasicAnimal {
    void walk();
}
class BasicDog implements BasicAnimal {
    @Override
    public void walk()
    {
        System.out.println("Dog is walking");
    }
}


public class interfaces {
    public static void main(String[] args) {
        BasicDog dog = new BasicDog();
        dog.walk();
    }
}

// Multiple inheritance is not supported in Java.
//  so we use interfaces to achieve multiple inheritance.

