public abstract class OrderHandler {
    private OrderHandler next;

    public OrderHandler(OrderHandler next) {
        this.next = next;
    }

    public void printOrderHandle(Order order){
        System.out.println(this + "handling order: " + order);
    }

    public void handleOrder(Order order){
        if (this.next != null){
            next.handleOrder(order);
        }
    }
}
