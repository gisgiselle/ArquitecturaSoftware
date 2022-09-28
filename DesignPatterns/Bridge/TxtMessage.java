public class TxtMessage extends Message {
    @Override
    public void SendMessage(String message) {
        System.out.println("text message is: "+message);
    }
}
