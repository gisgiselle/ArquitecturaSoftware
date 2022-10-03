public class CastleGuard extends OrderHandler{
    public CastleGuard(OrderHandler handler) {
        super(handler);
    }

    @Override
    public void handleOrder(Order order){
        if(order.getOrderType().equals(Order.OrderType.DEFEND_CASTLE)){
            printOrderHandle(order);
            order.setDone(true);
        }else {
            super.handleOrder(order);
        }
    }

    @Override
    public String toString() {
        return "Castle Guard ";
    }
}
