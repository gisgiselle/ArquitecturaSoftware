public class ChristmasLights extends TreeDecorator{

    public ChristmasLights(ChristmasTree ct) {
        super(ct);
    }

    public String decorate(){
        return super.decorate() +decoratingWithLights();
    }

    public String decoratingWithLights(){
        return " with Christmas Lights";
    }


}
