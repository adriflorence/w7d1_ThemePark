public abstract class Stall implements IReviewed, ITicketed {

    private String name;
    private String ownerName;
    private String parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, String parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public double defaultPrice() {
        return 2;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
