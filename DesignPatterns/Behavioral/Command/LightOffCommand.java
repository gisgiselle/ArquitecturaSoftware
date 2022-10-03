public class LightOffCommand implements Command{
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.switchOff();
        System.out.println("Lights off");
    }
}
