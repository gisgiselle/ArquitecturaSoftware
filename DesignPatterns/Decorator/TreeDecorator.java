public class TreeDecorator implements ChristmasTree{
    private ChristmasTree ct;

    public TreeDecorator(ChristmasTree ct) {
        this.ct = ct;
    }

    @Override
    public void decorate() {
        this.ct.decorate();
    }

}
