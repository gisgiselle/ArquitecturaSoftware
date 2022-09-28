public class Queen {
    OrderHandler chain;

    public Queen(){
        buildChain();
    }

    private void buildChain() {
        chain = new CastleGuard(new CastleCleaner(new CorgiCaretaker(null)));
    }

    public void makeOrder(Order order){
        chain.handleOrder(order);
    }
}
