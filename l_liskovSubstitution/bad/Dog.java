package l_liskovSubstitution.bad;

public class Dog extends Pet {
    
    public Dog(){}

    @Override
    public void bark() {
        System.out.println("Guau Guau");
    }

}
