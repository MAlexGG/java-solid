package d_dependencyInversion.bad;

/* 

D - DEPENDENCY INVERSION

Las clases de alto nivel (lógica de negocio) no deben depender directamente de las clases de bajo nivel (detalles o implementaciones concretas). Ambas deben depender de abstracciones (interfaces)

*/

public class Notifications {

    private MailNotification mailNotification;

    public Notifications(){
        //Crea dependencia con la notificación vía mail
        this.mailNotification = new MailNotification();
    }

    //Si mañana las notificaciones se hacen vía whatsapp o sms tengo que modificar esta clase, lo que hace que el código sea rígido y difícil de mantener.
    public void sendNotification(){
        mailNotification.sendMail();
    }


}
