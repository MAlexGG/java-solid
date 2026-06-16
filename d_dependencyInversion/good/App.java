package d_dependencyInversion.good;

public class App {

    //Al crear el objeto se envía o se inyecta la dependencia en el parámetro.
    public static void main(String[] args) {
        
        SmsNotification sms = new SmsNotification();
        Notifications notifications = new Notifications(sms);
        notifications.send();

        MailNotification mail = new MailNotification();
        Notifications notifications2 = new Notifications(mail);
        notifications2.send();

    }

}
