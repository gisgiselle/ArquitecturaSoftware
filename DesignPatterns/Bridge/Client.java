import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa mensaje");
        String messageInput = sc.nextLine();
        FbMessageSender fbMessageSender = new FbMessageSender();
        WhatsMessageSender whtsMessageSender = new WhatsMessageSender();
        fbMessageSender.sendMessage(messageInput);
        whtsMessageSender.sendMessage(messageInput);
    }
}

