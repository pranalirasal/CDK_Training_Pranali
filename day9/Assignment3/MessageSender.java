/**
 * Created by rasalp on 8/2/2017.
 */
public class MessageSender {
    public static void main(String[] args) {
        Message.sendMessage("This is sms message", (String msg) -> {
            System.out.println(msg);
        });

        Message.sendMessage("This is WhatsApp message", (String msg) -> {
            System.out.println(msg);
        });

        Message.sendMessage("This is an email", (String msg) -> {
            System.out.println(msg);
        });
    }
}
