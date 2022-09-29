public class Toy extends TreeDecorator{
    public Toy(ChristmasTree ct) {
        super(ct);
    }

    public String decorate(){
        return super.decorate() +decoratingWithToy();
    }

    public String decoratingWithToy(){
        return " with Toy";
    }
}
