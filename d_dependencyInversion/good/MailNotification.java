package d_dependencyInversion.good;

// 2. Módulo de bajo nivel

public class MailNotification implements NotificationType {

    @Override
    public void sendNotification() {
        System.out.println("Sending an email to adopter...");
    }

}
