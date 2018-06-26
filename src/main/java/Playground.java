public class Playground extends Attraction implements ISecurity{

    public Playground(String name, double rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){ // public
        return visitor.getAge() < 15;
    }

    public double defaultPrice() {
        return 0;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }


}
