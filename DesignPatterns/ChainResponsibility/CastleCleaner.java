public class CastleCleaner extends OrderHandler{

    public CastleCleaner(OrderHandler next) {
        super(next);
    }

    @Override
    public void handleOrder(Order order){
        if(order.getOrderType().equals(Order.OrderType.CLEAN_CASTLE)){
            printOrderHandle(order);
            order.setDone(true);
        }else {
            super.handleOrder(order);
        }
    }

    @Override
    public String toString() {
        return "Castle Cleaner ";
    }
}
