public class Order {
    private OrderType orderType;
    private String orderDesc;
    private boolean done;
    public enum OrderType {
        FEED_CORGIS, DEFEND_CASTLE, CLEAN_CASTLE
    }

    public Order(OrderType orderType, String orderDesc) {
        this.orderType = orderType;
        this.orderDesc = orderDesc;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    @Override
    public String toString() {
        return getOrderDesc();
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
