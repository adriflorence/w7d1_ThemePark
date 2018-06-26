public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, String parkingSpot, double rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public double defaultPrice() {
        return 6.60;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

}
