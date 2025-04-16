interface Animal {
    abstract void walk(); // abstract keyword is optional in interface
    public void run(); // public keyword is optional in interface
}
interface Mammal {
    void run();
}
class Dog implements Animal {
    public void walk()
    {
        System.out.println("Dog is walking");
    }
    public void run() {
        System.out.println("Dog is running");
    }
}


public class Minterfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
        dog.run();
    }
}
