package i_interfaceSegregation.bad;

public class Dog extends Pet implements PetActions {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Guau guau");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking");
    }

    @Override
    public void swim() {
        System.err.println(this.getName() + " is swiming but very badly");
    }

}
