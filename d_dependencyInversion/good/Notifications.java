package d_dependencyInversion.good;

/* 

D - DEPENDENCY INVERSION

Las clases de alto nivel (lógica de negocio) no deben depender directamente de las clases de bajo nivel (detalles o implementaciones concretas). Ambas deben depender de abstracciones (interfaces)

*/

// 3. Módulo de alto nivel (No le importa qué pasarela usa, solo que cumpla la interfaz)

public class Notifications {

    private NotificationType notificationType;

    // Inyección de dependencia a través del constructor
    public Notifications(NotificationType notificationType){
        this.notificationType = notificationType;
    }

    public void send(){
        this.notificationType.sendNotification();
    }
    

}
