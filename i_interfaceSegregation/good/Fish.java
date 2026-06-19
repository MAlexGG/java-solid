package i_interfaceSegregation.good;

public class Fish extends Pet implements Swimmable {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Glup glup");
    }

    @Override
    public void swim() {
        System.out.println("The fish can swim");
    }

}
