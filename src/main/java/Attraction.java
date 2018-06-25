import java.util.ArrayList;

public abstract class Attraction extends ThemePark implements IReviewed, ISecurity, ITicketed {

    private String name;
    private double rating;
    double till = 0.0;
    ArrayList<Visitor> visitors = new ArrayList<Visitor>();

    public Attraction(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
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

    public void getMoneyFrom(Visitor visitor){
        till += priceFor(visitor);
    }
}
