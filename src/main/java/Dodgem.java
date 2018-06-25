public class Dodgem extends Attraction implements ITicketed {

    public Dodgem(String name, double rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return true;
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12) {
            return defaultPrice() / 2;
        }
        return defaultPrice();
    }

}
