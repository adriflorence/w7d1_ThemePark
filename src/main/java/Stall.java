import java.util.ArrayList;

public abstract class Stall implements IReviewed, ITicketed {

    private String name;
    private String ownerName;
    private String parkingSpot;
    private double rating;
    double till = 0.0;
    ArrayList<Visitor> visitors = new ArrayList<Visitor>();

    public Stall(String name, String ownerName, String parkingSpot, double rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return (rating * 2) / 2.0;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumberOfVisitors() {
        return visitors.size();
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }

    public void getMoneyFrom(Visitor visitor){
        till += priceFor(visitor);
    }
}
