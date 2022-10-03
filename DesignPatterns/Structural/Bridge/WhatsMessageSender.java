public class WhatsMessageSender implements MessageSender{
    @Override
    public void sendMessage(String Message) {
        System.out.println(Message + "Sent with Whatsapp");
    }
}
