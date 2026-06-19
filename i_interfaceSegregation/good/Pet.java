package i_interfaceSegregation.good;

/* 

I - INTERFACE SEGREGATION

Ninguna clase debe ser forzada a implementar métodos, comportamientos o contratos que no utiliza. En lugar de crear interfaces masivas y generales, se deben crear interfaces pequeñas y específicas para cada tipo de cliente.

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
