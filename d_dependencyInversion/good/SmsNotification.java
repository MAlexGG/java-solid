package d_dependencyInversion.good;

// 2. Módulo de bajo nivel

public class SmsNotification implements NotificationType {

    @Override
    public void sendNotification() {
        System.out.println("Sending a sms to adopter...");
    }

}
