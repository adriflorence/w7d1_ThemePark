public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public double defaultPrice() {
        return 2.80;
    }

}
