public class CorgiCaretaker extends OrderHandler{
    public CorgiCaretaker(OrderHandler next) {
        super(next);
    }

    @Override
    public void handleOrder(Order order){
        if(order.getOrderType().equals(Order.OrderType.FEED_CORGIS)){
            printOrderHandle(order);
            order.setDone(true);
        }else {
            super.handleOrder(order);
        }
    }

    @Override
    public String toString() {
        return "Corgi Caretaker ";
    }
}
