public class Client {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        control.setCommand(lightOn);
        control.pressButton();

        control.setCommand(lightOff);
        control.pressButton();
    }
}
