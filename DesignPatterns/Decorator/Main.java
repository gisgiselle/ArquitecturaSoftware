public class Main {
    public static void main(String[] args) {
        ChristmasTree gisellesTree = new Toy(new ChristmasTreeImpl());
        System.out.println("---Decorating Giselle's tree---");
        gisellesTree.decorate();
        ChristmasTree andresTree = new Toy(new ChristmasLights(new ChristmasTreeImpl()));
        System.out.println("---Decorating Andres' tree---");
        andresTree.decorate();

    }
}
