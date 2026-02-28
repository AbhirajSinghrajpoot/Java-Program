interface MultiAnimal {
    abstract void walk(); // abstract keyword is optional in interface
    public void run(); // public keyword is optional in interface
}
interface Mammal {
    void run();
}
class MultiDog implements MultiAnimal, Mammal {
    @Override
    public void walk()
    {
        System.out.println("Dog is walking");
    }
    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}


public class Minterfaces {
    public static void main(String[] args) {
        MultiDog dog = new MultiDog();
        dog.walk();
        dog.run();
    }
}
