public class Main {
    public static void main(String[] args) {
        ChristmasTree gisellesTree = new Toy(new ChristmasTreeImpl());
        ChristmasTree andresTree = new ChristmasLights(new ChristmasTreeImpl());

        System.out.println("Giselle's tree: " +gisellesTree);
        System.out.println("Andres' tree: " +andresTree);

    }
}
