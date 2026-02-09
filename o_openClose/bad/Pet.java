package o_openClose.bad;

/* O - OPEN CLOSE PRINCIPLE

Una clase, módulo o función debe estar abierta para extensión pero cerrada para modificación.

*/

public abstract class Pet {

    private String name;
    private int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Si tiene que ver con Pet
    public int birthday(){
        return this.age += 1;
    }

    //Si es que tengo que añadir una mascota tendré que modificar este método
    public void makeSound(Pet pet) {
        if (pet instanceof Dog) System.out.println("Guau guau");
        if (pet instanceof Cat) System.out.println("Miau miau");
    }

    //Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
