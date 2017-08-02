/**
 * Created by rasalp on 8/2/2017.
 */
public class Message {
    public static void sendMessage(String message, Messenger<String> messenger) {
        messenger.send(message);
    }
}
