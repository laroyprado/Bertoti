import classes.EmailNotification;
import classes.SMSNotification;

public class Main {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        SMSNotification smsNotification = new SMSNotification();

        emailNotification.sendEmailNotification("Hello, this is an email notification!");


        smsNotification.sendSMSNotification("Hello, this is an SMS notification!");
    }
}