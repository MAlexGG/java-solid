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

    //No tiene nada que ver con la creación de mascotas, tiene que ver con la base de datos
    public void savePetInDB() {
        System.out.println(name + " is saved in DB");
    }

    //No tiene nada que ver con la creación de mascotas. tiene que ver con enviar notificaciones
    public void sendNotification() {
        System.out.println("Sending notificacion from Pet");
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
