package i_interfaceSegregation.good;

/* 

I - INTERFACE SEGREGATION

Las clases no deben ser forzadas a depender de métodos que no utilizan.

*/

public abstract class Pet {

    private String name;
    private int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int birthday(){
        return this.age += 1;
    }

    public abstract void makeSound();

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
