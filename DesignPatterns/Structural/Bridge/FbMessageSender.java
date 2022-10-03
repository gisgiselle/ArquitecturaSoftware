public class FbMessageSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println(message + "Sent with Facebook Messenger");
    }
}
