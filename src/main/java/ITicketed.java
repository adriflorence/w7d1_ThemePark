public interface ITicketed {

    double defaultPrice();
    double priceFor(Visitor visitor);
    void getMoneyFrom(Visitor visitor);

}
