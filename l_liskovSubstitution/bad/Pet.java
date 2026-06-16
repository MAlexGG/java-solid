package l_liskovSubstitution.bad;

/* 
L - LISKOV SUBSTITUTION

Si en un programa utilizas una clase base, deberías poder sustituirla por cualquiera de sus clases hijas sin alterar el funcionamiento esperado. Es decir, un subtipo nunca debe modificar el comportamiento original ni las reglas del supertipo. 

*/

public abstract class Pet {

    public Pet(){}

    public abstract void bark();

}
