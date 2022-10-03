public abstract class Message {
   private MessageSender messageSender;

   public abstract void SendMessage(String message);

    public MessageSender getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
}
