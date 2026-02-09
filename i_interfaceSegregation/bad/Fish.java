package i_interfaceSegregation.bad;

public class Fish extends Pet implements PetActions {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Glup glup");
    }

    //Este método es de obligatoria implementación pero no sirve para fish entonces se deben separar las acciones, entonces como no sirven todos los métodos dentro de una interfaz, hay que separarlos
    @Override
    public void walk() {
        System.err.println("oh oh fish don't walk");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swiming");
    }

}
