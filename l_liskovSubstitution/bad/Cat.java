package l_liskovSubstitution.bad;

/* No debería lanzar un error porque es un método que una clase hija no puede hacer */

public class Cat extends Pet {

    public Cat(){}

    @Override
    public void bark() {
        throw new Error("I can't bark");
    }

}
