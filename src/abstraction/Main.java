package abstraction;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.bark();

        Animal c= new Cat();
        c.bark();
    }
}
