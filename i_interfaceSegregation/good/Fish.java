package i_interfaceSegregation.good;

public class Fish extends Pet {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Glup glup");
    }

}
