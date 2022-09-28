public class Main {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.makeOrder(new Order(Order.OrderType.DEFEND_CASTLE, "Guards, do your rounds"));
        queen.makeOrder(new Order(Order.OrderType.CLEAN_CASTLE, "The castle is a mess"));
        queen.makeOrder(new Order(Order.OrderType.DEFEND_CASTLE, "Someone is making fun of me, arrest them"));
        queen.makeOrder(new Order(Order.OrderType.FEED_CORGIS, "My babies are hungry"));
    }
}
