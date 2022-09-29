public class Toy extends TreeDecorator{
    public Toy(ChristmasTree ct) {
        super(ct);
    }

    public void decorate(){
        super.decorate();
        System.out.println("Decorating with cute toys");
    }
}
