/* S - SINGLE RESPONSABILITY 

 Una clase debe tener responsabilidad sobre una sola parte de la funcionalidad proporcionada por el software y esta responsabilidad debe estar encapsulada en su totalidad por la clase.

*/

public class Pet {

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
