/**
 * Created by rasalp on 7/25/2017.
 */
public class MailSender {
    public static void main (String[] s) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("admin", "xyz@yahoo.com", "Hello World !");
    }
}
