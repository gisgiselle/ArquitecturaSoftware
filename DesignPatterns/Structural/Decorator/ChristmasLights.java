public class ChristmasLights extends TreeDecorator{

    public ChristmasLights(ChristmasTree ct) {
        super(ct);
    }

    public void decorate(){
         super.decorate();
            System.out.println("Decorating with christmas lights");
    }


}
