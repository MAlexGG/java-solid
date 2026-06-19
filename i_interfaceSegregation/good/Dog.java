package i_interfaceSegregation.good;

public class Dog extends Pet implements Walkable, Swimmable{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Guau guau");
    }

    @Override
    public void walk() {
        System.out.println("The dog can walk");
    }

    @Override
    public void swim() {
        System.out.println("The dog can swim");
    }

}
